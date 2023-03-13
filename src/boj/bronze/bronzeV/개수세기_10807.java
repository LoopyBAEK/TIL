package boj.bronze.bronzeV;

import java.util.Arrays;
import java.util.Scanner;

public class 개수세기_10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력받을 정수 개수
        int n = sc.nextInt();
        // 입력받은 정수를 저장할 배열
        int[] numbers = new int[n];
        // 정수 배열에서 정수 v가 몇 개인지 세기 위한 변수
        int count = 0;

        // 정수 입력받아 배열에 저장하기
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }

        // v 입력받기
        int v = sc.nextInt();

        // v가 몇 개인지 세기
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == v){
                count++;
            }
        }

        // v 개수 출력
        System.out.println(count);
    }
    // 2023-03-13
}
