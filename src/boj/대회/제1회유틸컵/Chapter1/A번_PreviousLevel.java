package boj.대회.제1회유틸컵.Chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A번_PreviousLevel {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 레벨의 개수
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            int level = Integer.parseInt(st.nextToken());
            if(level == 300){
                sb.append(1).append(" ");
            }else if(level >= 275 && level < 300){
                sb.append(2).append(" ");
            }else if(level >= 250 && level < 275){
                sb.append(3).append(" ");
            }else{
                sb.append(4).append(" ");
            }
        }
        System.out.println(sb);
    }
}
