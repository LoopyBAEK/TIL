package boj.bronze.bronzeIII;

import java.util.Scanner;

public class 최댓값_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 최댓값 받을 변수
        int max = 0;
        // 최댓값이 몇 번째인지 받을 변수
        int arrNum = 0;

        // 자연수들을 배열에 받음
        int[] numArray = new int[9];
        for(int i = 0; i < 9; i++){
            numArray[i] = sc.nextInt();
        }

        // 최댓값, 최댓값 몇 번째인지 찾기
        for(int i = 0; i < numArray.length; i++){
            if(max < numArray[i]){
                max = numArray[i];
                arrNum = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(arrNum);
    }
    // 2023-03-12
}
