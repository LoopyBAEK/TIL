package boj.silver.silverV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 소수찾기_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 정수의 개수
        int n = Integer.parseInt(br.readLine());

        // 정수 넣을 배열
        int[] numbers = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 배열에 정수 넣기
        for(int i = 0; i < n; i++){
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        // 소수만 골라내기
        for(int i = 0; i < n; i++){
            // 정수가 1일 경우
            if(numbers[i] == 1){
                numbers[i] = 0;
            }else {
                for(int j = 1; j <= numbers[i]; j++){
                    if(numbers[i] % j == 0 && numbers[i] != j && j != 1){
                        numbers[i] = 0;
                    }
                }
            }
        }

        // 소수 개수 세기
        int count = 0;
        for(int i = 0; i < n; i++){
            if(numbers[i] != 0){
                count++;
            }
        }

        System.out.println(count);
    }
    // 2023-03-29
}
