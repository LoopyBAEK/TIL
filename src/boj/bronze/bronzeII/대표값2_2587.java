package boj.bronze.bronzeII;

import java.util.Arrays;
import java.util.Scanner;

public class 대표값2_2587 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int avg = 0;    // 평균 구하기 위한 변수

        int[] numArray = new int[5];    // 자연수 배열

        for(int i = 0; i < numArray.length; i++){
            numArray[i] = sc.nextInt();
            avg += numArray[i]; // 평균 구하기 위해 합계 구하기
        }

        System.out.println(avg / 5);    // 평균
        // 중간값
        Arrays.sort(numArray);
        System.out.println(numArray[2]);
    }
    // 2023-03-09
}
