package boj.bronze.bronzeI;

import java.io.*;
import java.util.StringTokenizer;

public class 최대공약수와최소공배수_2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // a와 b 중 작은 수 찾기
        int small = 0;
        int big = 0;
        if(a < b){
            small = a;
            big = b;
        }else{
            small = b;
            big = a;
        }

        int GCD = gcd(big, small);
        // 최소공배수 구하는 법
        int LCM = (big * small) / GCD;
        System.out.println(GCD);
        System.out.println(LCM);
    }

    // 최대공약수 구하는 법
    static int gcd(int a, int b) {
        if(b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }
    // 2023-03-26
    // 걍 외우셈...
}
