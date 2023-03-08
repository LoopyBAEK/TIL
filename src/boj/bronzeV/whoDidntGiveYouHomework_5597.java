package boj.bronzeV;

import java.util.Arrays;
import java.util.Scanner;

public class whoDidntGiveYouHomework_5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        // 제출한 출석번호 배열에 담기
        int[] stuArr = new int[31];
        for(int i = 0; i < 28; i++){
            int n = sc.nextInt();
            stuArr[n] = 1;
        }

        // for문을 이용해 없는 출석번호 찾기
        for(int i = 1; i <= 30; i++){
            if(stuArr[i] == 0){
                if(num1 == 0){
                    num1 = i;
                }else{
                    num2 = i;
                }
            }
        }

        if(num2 > num1){
            System.out.println(num1);
            System.out.println(num2);
        }else{
            System.out.println(num2);
            System.out.println(num1);
        }

        // 2023-02-04
    }
}
