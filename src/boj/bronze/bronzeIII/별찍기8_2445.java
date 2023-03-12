package boj.bronze.bronzeIII;

import java.util.Scanner;

public class 별찍기8_2445 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int condition = n * 2;
        int minus = 1;
        for(int i = 0; i < condition - 1; i++){
            for(int j = 0; j < condition; j++){
                if(i <= n - 1){
                    int empty = (condition - (condition - ((i + 1) * 2))) / 2;
                    if(i >= j || j > condition - empty - 1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }else{
                    int empty = (condition - (condition - ((i - minus) * 2))) / 2;

                    if(j <= empty - 1 || j >= condition - empty){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }

            }
            if(i + 1 > condition / 2){
                minus += 2;
            }
            System.out.println();
        }
    }
    // 2023-03-12
}
