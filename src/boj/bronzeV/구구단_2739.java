package boj.bronzeV;

import java.util.Scanner;

public class 구구단_2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // import 단축키 -> Alt + Enter
        int num = sc.nextInt();

        // 구구단 돌리기
        for(int i = 1; i <= 9; i++){
            System.out.println(num + " * " + i + " = " + num*i);
        }

        // 2023-02-04
    }
}
