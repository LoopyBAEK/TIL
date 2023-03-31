package boj.silver.silverIV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class 괄호_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        // 스택에다가 괄호 집어넣기
        for(int i = 0; i < t; i++){
            Stack<Character> stack = new Stack<>();
            // 스택이 비어있는지 확인
            boolean empty = false;
            StringTokenizer st = new StringTokenizer(br.readLine());
            String ch = st.nextToken();
            for(int j = 0; j < ch.length(); j++){
                // 여는 괄호일 때 push
                if(ch.charAt(j) == '('){
                    stack.push('(');
                    // 스택이 비었는데 닫는 괄호일 경우
                }else if(stack.isEmpty()){
                    empty = true;
                    break;
                    // 닫는 괄호일 경우
                }else{
                    stack.pop();
                }
            }

            // 열린 괄호의 수보다 닫는 괄호의 수가 많은 경우
            if(empty){
                System.out.println("NO");
                // 스택이 빈 경우
            }else if(stack.isEmpty()){
                System.out.println("YES");
                // 스택이 비지 않은 경우
            }else{
                System.out.println("NO");
            }
        }
    }
    // 2023-03-30
}
