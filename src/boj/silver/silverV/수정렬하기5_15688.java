package boj.silver.silverV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 수정렬하기5_15688 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[n];

        for(int i = 0; i < n; i++){
            numbers[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(numbers);

        StringBuilder sb = new StringBuilder(2 * n);
        for(int i = 0; i < n; i++){
            sb.append(numbers[i]).append("\n");
        }

        System.out.println(sb);
    }

    // 2023-06-09
    // 매우 많은 시간초과를 냈음...
}
