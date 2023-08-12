package boj.대회.제3회_KAUPC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A번_스케이트보드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 사람의 수
        int n = Integer.parseInt(br.readLine());

        // 사람들의 점수를 저장할 배열
        int[] score = new int[n];

        for(int i = 0; i < n; i++){
            // 런 점수와 트릭 점수를 담을 배열
            int[] run = new int[2];
            int[] tric = new int[5];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 2; j++){
                run[j] = Integer.parseInt(st.nextToken());
            }

            for(int j = 0; j < 5; j++){
                tric[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(run);
            Arrays.sort(tric);
            score[i] += run[1] + tric[4] + tric[3];
        }
        Arrays.sort(score);

        System.out.println(score[n - 1]);
    }
}
