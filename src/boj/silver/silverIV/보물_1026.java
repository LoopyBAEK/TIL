package boj.silver.silverIV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class 보물_1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // n
        int n = Integer.parseInt(br.readLine());

        // a 배열
        int[] a = new int[n];
        // b 배열
        Integer[] b = new Integer[n];

        // a, b 배열 담기
        for(int i = 0; i < 2; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++){
                if(i == 0){
                    a[j] = Integer.parseInt(st.nextToken());
                }else{
                    b[j] = Integer.parseInt(st.nextToken());
                }
            }
        }
        // 배열 정렬하기
        Arrays.sort(a);
        Arrays.sort(b, Collections.reverseOrder());
//        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.toString(b));

        // 최소 S 계산하기
        int s = 0;
        for(int i = 0; i < n; i++){
            s += a[i] * b[i];
        }
        System.out.println(s);
    }
}
