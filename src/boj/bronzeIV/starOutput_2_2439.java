package boj.bronzeIV;

import java.util.Scanner;

public class starOutput_2_2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // N 받기
        int n = sc.nextInt();
        String star = "*";  // 별
        String empty = " "; // 공백

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(j <= n - i){
                    System.out.print(empty);
                }else{
                    System.out.print(star);
                }
            }
            System.out.println();
        }
    }
    // 2023-03-08
}
