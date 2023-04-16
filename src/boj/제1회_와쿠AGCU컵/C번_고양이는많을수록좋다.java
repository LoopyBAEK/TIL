package boj.제1회_와쿠AGCU컵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C번_고양이는많을수록좋다 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long cat = 1;
        long count = 1;

        if (n == 0) {
            System.out.println(0);
        }else if(n == cat){
            System.out.println(count);
        }else{
            while(cat < n){
                if(cat + 1 == n){
                    count++;
                    break;
                }else{
                    cat += cat;
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
