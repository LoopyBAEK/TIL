package boj.bronze.bronzeIV;

import java.util.Scanner;

public class 주사위세개_2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a == b && a == c){   // 같은 눈 3개
            System.out.println(10000 + a * 1000);
        }else if(a == b || b == c || a == c){   // 같은 눈 2개
            if(a == b){
                System.out.println(1000 + a * 100);
            }else if(b == c){
                System.out.println(1000 + b * 100);
            }else{
                System.out.println(1000 + c * 100);
            }
        }else{  // 다 다른 눈
            if(a > b && a > c){
                System.out.println(a * 100);
            }else if(b > a && b > c){
                System.out.println(b * 100);
            }else{
                System.out.println(c * 100);
            }
        }
    }
    // 2023-03-09
}
