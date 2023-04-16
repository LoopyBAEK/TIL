package boj.제1회_와쿠AGCU컵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A번_초코바 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 가지고 있는 100원짜리 동전의 갯수
        int num = Integer.parseInt(st.nextToken()) * 100;
        // 초코바의 가격
        int price = Integer.parseInt(st.nextToken());

        if(num >= price){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
