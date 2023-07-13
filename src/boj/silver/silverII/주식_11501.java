package boj.silver.silverII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 주식_11501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 테스트 케이스 수
        int t = Integer.parseInt(br.readLine());

        // 최대 수익을 담을 배열
        long[] ans = new long[t];
        for(int i = 0; i < t; i++){
            int day = Integer.parseInt(br.readLine());

            // 주가 정보를 담을 배열
            int[] stock = new int[day];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < day; j++){
                stock[j] = Integer.parseInt(st.nextToken());
            }

            int max = 0;
            for(int j = day - 1; j >= 0; j--){
                if(stock[j] > max){
                    max = stock[j];
                }else{
                    ans[i] += (max - stock[j]);
                }
            }
        }

        // 답 출력
        for(long result : ans){
            System.out.println(result);
        }
    }
}
