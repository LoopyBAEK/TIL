package boj.silver.silverIV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 설탕배달_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 배달해야할 설탕 kg
        int n = Integer.parseInt(br.readLine());

        int count = 0;

        while(true){
            if(n == 4 || n == 7){
                System.out.println(-1);
                break;
            }
            // n이 5로 나누어떨어지면 출력
            if(n % 5 == 0){
                count += n / 5;
                System.out.println(count);
                break;
                // 5로 나누어떨어지지 않으면 -3
            }else{
                n -= 3;
                count++;
            }
        }
    }
    // 2023-03-27
    // 3과 5로 구성하지 못하는 수는 4와 7이다
}
