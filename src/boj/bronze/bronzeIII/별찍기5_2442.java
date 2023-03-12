package boj.bronze.bronzeIII;

import java.util.Scanner;

public class 별찍기5_2442 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num = 0;
        int condition = 0;
        for(int i = 1; i <= n; i++){
            num = n - i;
            condition = (2 * i - 1) + num;
            for(int j = 0; j < condition; j++){
                if(num > j){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    // 2023-03-11
}
