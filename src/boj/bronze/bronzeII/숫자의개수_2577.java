package boj.bronze.bronzeII;

import java.util.Scanner;

public class 숫자의개수_2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] number = new int[10];
        String result = String.valueOf(a * b * c);

        for(int i = 0; i < result.length(); i++){
            number[result.charAt(i) - '0']++;
        }

        for(int i = 0; i < number.length; i++){
            System.out.println(number[i]);
        }
    }
    // 2023-03-12
}
