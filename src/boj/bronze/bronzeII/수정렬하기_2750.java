package boj.bronze.bronzeII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 수정렬하기_2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 수의 갯수
        int n = Integer.parseInt(br.readLine());

        // 숫자들을 담을 배열
        int[] numbers = new int[n];

        // 배열에 담기
        for(int i = 0; i < n; i++){
            numbers[i] = Integer.parseInt(br.readLine());
        }

        // 정렬
        Arrays.sort(numbers);

        // 출력
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }

    // 2023-06-05
}
