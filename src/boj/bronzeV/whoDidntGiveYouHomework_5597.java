package boj.bronzeV;

import java.util.Arrays;
import java.util.Scanner;

public class whoDidntGiveYouHomework_5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        int[] studentsArr = new int[30];
        // 1~30번까지 번호 배열에 할당
        for(int i = 0; i < 30; i++){
            studentsArr[i] = i+1;
        }

        // 제출한 출석번호 배열에 담기
        int[] submissionCompleted = new int[30];
        for(int i = 0; i < 28; i++){
            submissionCompleted[i] = sc.nextInt();
        }
        Arrays.sort(submissionCompleted);   // 배열 오름차순 정렬

        // 두 배열 비교 후 없는 출석번호 찾기
        int j = 0;
        for(int i = 0; i < 28; i++){
            j += i;
            if(studentsArr[j] != submissionCompleted[i]){
                if(num1 != 0){
                    num2 = studentsArr[j];
                }else{
                    num1 = studentsArr[j];
                }
                j = 0;
                j += 1;
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
