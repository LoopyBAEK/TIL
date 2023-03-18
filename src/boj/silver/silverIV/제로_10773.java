package boj.silver.silverIV;

import java.io.*;
import java.util.Stack;

public class 제로_10773 {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 주어질 정수 개수
        int k = Integer.parseInt(br.readLine());
        // 정수 값
        int num = 0;
        // 정수들의 합
        int sum = 0;

        // k번 돌면서 정수들의 합 구하기
        for(int i = 0; i < k; i++){
            num = Integer.parseInt(br.readLine());
            if(num == 0){
                if(!stack.empty()){
                    // 스택 가장 위의 값을 없애줘야 하기에 합계에서 빼줌
                    sum -= stack.peek();
                    // 스택 가장 위의 값 없애기
                    stack.pop();
                }
            }else{
                // 현재 정수가 0이 아닐 때 스택 가장 위에 현재 정수 추가
                stack.push(num);
                // 정수들의 합계에도 더하기
                sum += stack.peek();
            }
        }
        // 정수들의 합계 출력
        System.out.println(sum);
    }
    // 2023-03-17
}
