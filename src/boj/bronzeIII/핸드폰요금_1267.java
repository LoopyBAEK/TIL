package boj.bronzeIII;

import java.util.Scanner;

public class 핸드폰요금_1267 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 통화시간 n개를 받기 위함
        int n = sc.nextInt();

        // 영식(y) 요금제, 민식(m) 요금제 비교를 위함
        int y = 0;
        int m = 0;

        // 영식(y), 민식(m) 요금제 요금 계산
        for(int i = 0; i < n; i++) {
            int curr = sc.nextInt();

            y += (curr / 30 + 1) * 10;
            m += (curr / 60 + 1) * 15;
        }

        // 요금 비교 후 저렴한 요금제 출력
        if(y < m){
            System.out.print("Y ");
            System.out.println(y);
        }else if(m < y){
            System.out.print("M ");
            System.out.println(m);
        }else{
            System.out.print("Y M ");
            System.out.println(y);
        }
    }
    // 2023-03-10
}
