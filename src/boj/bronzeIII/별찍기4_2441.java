package boj.bronzeIII;

import java.util.Scanner;

public class 별찍기4_2441 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int num = 0;
            for(int j = n; j > 0; j--){
                if(num < i){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
                num++;
            }
            System.out.println();
        }
    }
    // 2023-03-10
}
