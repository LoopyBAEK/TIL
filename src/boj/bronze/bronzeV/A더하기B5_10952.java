package boj.bronze.bronzeV;

import java.util.Scanner;

public class A더하기B5_10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bool = true;
        while(bool){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a + b != 0){
                System.out.println(a + b);
            }else{
                bool = false;
            }
        }
    }
    // 2023-03-14
}
