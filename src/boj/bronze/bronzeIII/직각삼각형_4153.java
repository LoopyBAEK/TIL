package boj.bronze.bronzeIII;

import java.io.*;
import java.util.StringTokenizer;

public class 직각삼각형_4153 {
    // 피타고라스의 정리
    // c제곱 = a제곱 + b제곱
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = 0;
        int b = 0;
        int c = 0;
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());

            if(a == 0 && b == 0 & c ==0){
                break;
            }else if(c > a && c > b){
                if(c * c == a * a + b * b){
                    bw.write("right \n");
                }else{
                    bw.write("wrong \n");
                }
            }else if(b > a && b > c){
                if(b * b == a * a + c * c){
                    bw.write("right \n");
                }else{
                    bw.write("wrong \n");
                }
            }else{
                if(a * a == c * c + b * b){
                    bw.write("right \n");
                }else{
                    bw.write("wrong \n");
                }
            }
        }
        bw.flush();
        bw.close();
    }
    // 2023-03-20
}
