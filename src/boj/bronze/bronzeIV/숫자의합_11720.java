package boj.bronze.bronzeIV;

import java.util.Arrays;
import java.util.Scanner;

public class 숫자의합_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String num = sc.next();
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        System.out.println(sum);
    }
    // 2023-03-14
}
