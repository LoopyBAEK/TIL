package boj.bronze.bronzeV;

import java.util.Scanner;

public class A더하기B4_10951 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bool = true;
        while(bool){
            if(sc.hasNextInt()){
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(a + b);
            }else{
                bool = false;
            }
        }
    }
    // 2023-03-14
}
