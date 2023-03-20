package boj.silver.silverII;

import java.io.*;
import java.util.Stack;

public class 키로거_5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 테스트 케이스 개수
        int t = Integer.parseInt(br.readLine());
        // 강산이가 입력한 문자열
        String l = "";
        // 커서 앞
        Stack<Character> frontStack = new Stack<>();
        // 커서 뒤
        Stack<Character> rearStack = new Stack<>();

        for(int i = 0; i < t; i++){
            l = br.readLine();
            for(int j = 0; j < l.length(); j++){
                if(l.charAt(j) == '-'){
                    if(!frontStack.isEmpty()){
                        frontStack.pop();
                    }
                } else if (l.charAt(j) == '<') {
                    if(!frontStack.isEmpty()){
                        rearStack.push(frontStack.pop());
                    }
                } else if (l.charAt(j) == '>') {
                    if(!rearStack.isEmpty()){
                        frontStack.push(rearStack.pop());
                    }
                }else {
                    frontStack.push(l.charAt(j));
                }
            }

            while (!frontStack.isEmpty()){
                rearStack.push(frontStack.pop());
            }

            while (!rearStack.isEmpty()){
                bw.write(rearStack.pop());
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
    // 2023-03-19
}
