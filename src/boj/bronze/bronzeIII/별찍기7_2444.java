package boj.bronze.bronzeIII;

import java.util.Scanner;

public class 별찍기7_2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int minus = n - 1;
        int plus = 0;
        int condition = 0;
        for(int i = 0; i < 2 * n - 1; i++){
            if(i < n){
                condition = (2 * (i + 1) - 1) + minus;
            }else{
                minus += 2;
                condition = (2 * (i - minus) - 1) + plus + 1;
            }

            for(int j = 0; j < condition; j++){
                if(i < n){
                    if(j >= minus){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }else{
                    if(plus < j){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            if(i < n){
                minus--;
            }else{
                plus++;
            }
            System.out.println();
        }
    }
    // 2023-03-12
}
