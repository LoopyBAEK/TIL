package boj.silver.silverIV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class 동전0_11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        // 동전의 가치를 저장할 스택
        Stack<Integer> coin = new Stack<>();

        // 동전의 가치 스택에 담기
        for(int i = 0; i < n; i++){
            coin.push(Integer.parseInt(br.readLine()));
        }

        // k원을 만드는데 필요한 동전 개수의 최솟값
        int count = 0;
        while(k != 0){
            if(k >= coin.peek()){
                count += k / coin.peek();
                k -= (k / coin.peek()) * coin.peek();
            }else{
                coin.pop();
            }
        }

        // 출력
        System.out.println(count);
    }
}
