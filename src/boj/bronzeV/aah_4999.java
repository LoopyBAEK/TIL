package boj.bronzeV;

import java.util.Scanner;

public class aah_4999 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jh = sc.next().length();
        int doctor = sc.next().length();

        if(jh >= doctor){
            System.out.println("go");
        }else{
            System.out.println("no");
        }

        // 2023-02-04
    }
}
