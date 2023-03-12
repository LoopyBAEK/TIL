package boj.bronze.bronzeIII;

import java.util.Scanner;

public class 별찍기6_2443 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int condition = 0;
        int minus = 1;
        int plus = 0;
        for(int i = 0; i < n; i++){
            condition = (2 * n - minus) + plus;
            for(int j = 0; j < condition; j++){
                if(i > j){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            minus += 2;
            plus++;
            System.out.println();
        }
    }
    // 2023-03-12
}
