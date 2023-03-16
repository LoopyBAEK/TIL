package boj.bronze.bronzeIII;

import java.util.Scanner;

public class 알람시계_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        if(m >= 45){
            m -= 45;
        }else{
            if(h != 0){
                h--;
            }else{
                h = 23;
            }
            m = m + 60 - 45;
        }
        System.out.printf("%d %d", h, m);
    }
    // 2023-03-16
}
