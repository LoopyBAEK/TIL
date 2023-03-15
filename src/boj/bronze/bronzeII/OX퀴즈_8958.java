package boj.bronze.bronzeII;

import java.util.Scanner;

public class OX퀴즈_8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 테스트 케이스 개수
        int t = sc.nextInt();
        // 점수
        int total = 0;
        String str = "";
        // 연속된 문제 계산 위한 변수
        int count = 1;

        for(int i = 0; i < t; i++){
            str = sc.next();
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(j) == 'O'){
                    total += count;
                    count++;
                }else{
                    count = 1;
                }
            }
            System.out.println(total);
            total = 0;
            count = 1;
        }
    }
    // 2023-03-14
}
