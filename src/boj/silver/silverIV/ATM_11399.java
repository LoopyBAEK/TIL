package boj.silver.silverIV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ATM_11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 사람의 수
        int n = Integer.parseInt(br.readLine());

        // 정렬을 위한 배열
        int[] order = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            order[i] = Integer.parseInt(st.nextToken());
        }

        // 최솟값을 구하기 위해 오름차순 정렬
        Arrays.sort(order);

        // 계산하기
        for(int i = 1; i < n; i++){
            order[i] = order[i - 1] + order[i];
        }
//        System.out.println(Arrays.toString(order));

        int total = order[0];
        for(int i = 1; i < n; i++){
            total += order[i];
        }

        // 출력
        System.out.println(total);
    }

    // 2023-07-05
}
