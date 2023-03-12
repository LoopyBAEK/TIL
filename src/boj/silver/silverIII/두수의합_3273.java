package boj.silver.silverIII;

import java.util.Arrays;
import java.util.Scanner;

public class 두수의합_3273 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nArray = new int[n];
        int count = 0;
        for(int i = 0; i < nArray.length; i++){
            nArray[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int[] past = new int[2000000];

        for(int i = 0; i < n; i++){
            if(x >= nArray[i]){
                if(past[x-nArray[i]] == 1) {
                    count++;
                }
            }
            past[nArray[i]]++;
        }

        System.out.println(count);
    }
    // 2023-03-12
}
