package boj.bronze.bronzeIV;

import java.util.Scanner;

public class 세수정렬_2752 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // a가 가장 큰 경우
        if(a > b && a > c){
            if(b > c){
                System.out.printf("%d %d %d", c, b, a);
            }else{
                System.out.printf("%d %d %d", b, c, a);
            }
        }

        // b가 가장 큰 경우
        if(b > a && b > c){
            if(a > c){
                System.out.printf("%d %d %d", c, a, b);
            }else{
                System.out.printf("%d %d %d", a, c, b);
            }
        }

        // c가 가장 큰 경우
        if(c > a && c > b){
            if(a > b){
                System.out.printf("%d %d %d", b, a, c);
            }else{
                System.out.printf("%d %d %d", a, b, c);
            }
        }
    }
    // 2023-03-09
}
