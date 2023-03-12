package boj.silver.silverV;

import java.util.Arrays;
import java.util.Scanner;

public class 방번호_1475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String room = sc.next();
        int[] number = new int[10];
        // 6 + 9
        int sixAndNine = 0;
        // 가장 많이 필요한 숫자 개수
        int theMost = 0;

        // 필요한 숫자 갯수 세기
        for(int i = 0; i < room.length(); i++){
            number[room.charAt(i) - '0']++;
        }

        // 6과 9, 가장 많이 필요한 갯수 구하기
        for(int i = 0; i < number.length; i++){
            if(i == 6 || i == 9){
                sixAndNine += number[i];
            }else{
                if(number[i] > theMost){
                    theMost= number[i];
                }
            }
        }

        // 번호 세트가 몇 개 필요한지 구하기
        if(sixAndNine > theMost){
            if(sixAndNine % 2 == 0){
                System.out.println(sixAndNine / 2);
            }else{
                System.out.println(sixAndNine / 2 + 1);
            }
        }else{
            System.out.println(theMost);
        }
    }
}
