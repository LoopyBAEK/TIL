package boj.silver.silverIV;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class 스택_10828 {
    public static void main(String[] args) throws IOException {
        // 스택 선언
        Stack<Integer> stack = new Stack<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 실행할 명령의 수
        int n = Integer.parseInt(br.readLine());
        // 명령어
        String command = "";
        // 주어지는 정수
        int x = 0;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 스택 명령어 실행
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            command = st.nextToken();
            if(command.equals("push")){
                x = Integer.parseInt(st.nextToken());
                stack.push(x);
            }else if(command.equals("pop")){
                if(stack.empty()){
                    bw.write(-1 + "\n");
                }else{
                    bw.write(stack.peek() + "\n");
                    stack.pop();
                }
            }else if(command.equals("size")){
                bw.write(stack.size() + "\n");
            }else if(command.equals("empty")){
                if(stack.empty()){
                    bw.write(1 + "\n");
                }else{
                    bw.write(0 + "\n");
                }
            }else if(command.equals("top")){
                if(stack.empty()){
                    bw.write(-1 + "\n");
                }else{
                    bw.write(stack.peek() + "\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }
    // 2023-03-17
}
