package boj.bronzeV;

import java.util.Scanner;

public class cardGame_5522 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;

        for(int i = 1; i <= 5; i++){
            total += sc.nextInt();
        }

        System.out.println(total);

        // 2023-02-04
    }
}
