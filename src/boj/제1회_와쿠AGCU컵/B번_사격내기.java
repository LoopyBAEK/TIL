package boj.제1회_와쿠AGCU컵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B번_사격내기 {
    public static void main(String[] args) throws IOException {
        // 점수판
        int[] score = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // a, b, c의 점수
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = 0;
        // c의 점수를 알아내기 위한 a, b의 점수판
        int[] cScore = new int[10];
        // 점수판의 길이
        int len = score.length - 1;

        while(len != -1){
            if(a >= score[len] || b >= score[len]){
                if(a >= score[len]){
                    a -= score[len];
                    cScore[len]++;
                }
                if(b >= score[len]){
                    b -= score[len];
                    cScore[len]++;
                }
            }
            len--;
        }

        for(int i = 0; i < cScore.length; i++){
            if(cScore[i] == 1){
                c += score[i];
            }
        }
        System.out.println(c);
    }
}
