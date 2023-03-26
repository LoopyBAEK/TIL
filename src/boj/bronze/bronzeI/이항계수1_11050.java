package boj.bronze.bronzeI;

import java.io.*;
import java.util.StringTokenizer;

public class 이항계수1_11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        // 분모
        int sum1 = 1;
        int k = Integer.parseInt(st.nextToken());
        // 분자
        int sum2 = 1;

        for(int i = 0; i < k; i++){
            sum1 *= n - i;
            sum2 *= k - i;
        }

        // 이항계수
        System.out.println(sum1 / sum2);
    }
    // 2023-03-24
}
