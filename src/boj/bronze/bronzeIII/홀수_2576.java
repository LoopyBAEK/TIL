package boj.bronze.bronzeIII;

import java.util.Scanner;

public class 홀수_2576 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int min = 0;

        for(int i = 0; i < 7; i++){
            int curr = sc.nextInt();
            if(curr % 2 == 1){  // 홀수인지 확인
                sum += curr;    // 합계 구하기
                // 최솟값 구하기
                if(min == 0){
                    min = curr;
                }else if(curr < min){
                    min = curr;
                }
            }
        }

        if(sum > 0){
            System.out.println(sum);
            System.out.println(min);
        }else{
            System.out.println(-1);
        }
    }
    // 2023-03-09
}
