package boj.silver.silverIV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class 게임을만든동준이_2847 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 레벨의 수
        int n = Integer.parseInt(br.readLine());

        // 점수
        Integer[] score = new Integer[n];
        for(int i = 0; i < n; i++){
            score[i] = Integer.parseInt(br.readLine());
        }

        // 감소시킬 횟수 구하기
        int count = 0;
        for(int i = n - 1; i >= 0; i--){
            if(i - 1 >= 0){
                if(score[i - 1] >= score[i]){
                    count += score[i - 1] - score[i] + 1;
                    score[i - 1] -= score[i - 1] - score[i] + 1;
                }
            }
        }
        // 출력
        System.out.println(count);
    }

    // 2023-07-05
}
