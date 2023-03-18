package boj.silver.silverII;

import com.sun.security.jgss.GSSUtil;

import java.io.*;
import java.util.*;

public class 에디터_1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 문자열 n 받기
        String n = br.readLine();

        // 커서 앞 스택
        Stack<Character> frontStack = new Stack<>();
        // 커서 뒤 스택
        Stack<Character> rearStack = new Stack<>();

        for(int i = 0 ; i < n.length(); i++){
            frontStack.push(n.charAt(i));
        }

        // 명령어 개수
        int m = Integer.parseInt(br.readLine());
        // 명령어 수행
        for(int i = 0; i < m; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if(command.length() > 0){
                if(command.equals("P")){
                    frontStack.push(st.nextToken().charAt(0));
                }else{
                    if(command.equals("L")){
                        if(!frontStack.isEmpty()){
                            rearStack.push(frontStack.pop());
                        }
                    }else if(command.equals("D")){
                        if(!rearStack.isEmpty()){
                            frontStack.push(rearStack.pop());
                        }
                    }else if(command.equals("B")){
                        if(!frontStack.isEmpty()){
                            frontStack.pop();
                        }
                    }
                }
            }
        }

        // Stack은 제일 먼저 들어간 값이 제일 나중에 나오므로 frontStack의 값을 rearStack으로 옮겨넣어줌
        while(!frontStack.isEmpty()){
            rearStack.push(frontStack.pop());
        }

        // 결과 출력
        while (!rearStack.isEmpty()){
            bw.write(rearStack.pop());
        }
        bw.flush();
        bw.close();
    }
    // 2023-03-18
}
