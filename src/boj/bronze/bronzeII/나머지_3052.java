package boj.bronze.bronzeII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 나머지_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 나머지 결과 저장할 배열
        int[] countArray = new int[1001];
        int curr = 0;
        for(int i = 0; i < 10; i++){
            curr = Integer.parseInt(br.readLine());
            countArray[curr % 42]++;
        }

        // 나머지 결과가 딱 1개인 값의 개수 구하기
        int count = 0;
        for (int j : countArray) {
            if (j > 0) {
                count++;
            }
        }

        // 결과 출력
        System.out.println(count);
    }
    // 2023-03-19
}
