package boj.bronze.bronzeII;

import java.util.Scanner;

public class 문자열반복_2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 테스트 케이스 개수
        int t = sc.nextInt();

        for(int i = 0; i < t; i++){
            // 문자 반복 회수
            int r = sc.nextInt();
            // 문자열
            String s = sc.next();
            // 최종 만들어진 문자열
            String p = "";

            // p에 문자 담기
            for(int j = 0; j < s.length(); j++){
                for(int k = 0; k < r; k++){
                    p = p + String.valueOf(s.charAt(j));
                }
            }

            System.out.println(p);
        }
    }
    // 2023-03-14
}
