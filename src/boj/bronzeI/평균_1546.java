package boj.bronzeI;

import java.util.Scanner;

public class 평균_1546 {
    public static void main(String[] args) {
        // 과목 개수 받기 위해 스캐너 선언
        Scanner sc = new Scanner(System.in);

        // 과목 개수 받기
        int num = sc.nextInt();

        // 점수들을 담을 배열 선언
        int[] numArr = new int[num];

        // 최댓값 받기 위해 변수 선언
        int maxNum = 0;

        // 평균값을 받기 위해 변수 선언
        float average = 0;

        // for문을 이용해 점수를 배열에 담기
        for(int i = 0; i < num; i++){
            numArr[i] = sc.nextInt();
        }
        // System.out.println(Arrays.toString(numArr));

        // 최댓값 찾기
        for(int i = 0; i < numArr.length; i++){
            if(numArr[i] > maxNum){
                maxNum = numArr[i];
            }
        }
        // System.out.println(maxNum);

        // 평균 구하기
        for(int i = 0; i < numArr.length; i++){
            average += numArr[i];
        }
        // System.out.println(average);

        System.out.println(average / maxNum * 100 / num);

        // 2023-02-08
    }
}
