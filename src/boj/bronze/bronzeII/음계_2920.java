package boj.bronze.bronzeII;

import java.util.Scanner;

public class 음계_2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 음계 순서 저장
        int[] sound = new int[8];
        // ascending인지 descending인지 mixed인지 구분 위한 변수
        boolean ascending = false;
        boolean descending = false;
        // ascending 비교 위한 변수
        int d = 2;
        // descending 비교 위한 변수
        int b = 7;

        // 음계 순서 저장
        for(int i = 0; i < 8; i++){
            sound[i] = sc.nextInt();
        }

        // ascending인지 descending인지 mixed인지 구분
        for(int i = 0; i < sound.length; i++){
            if(sound[0] == 1){
                if(sound[i] + 1 == d){
                    ascending = true;
                    d++;
                }else{
                    ascending = false;
                    System.out.println("mixed");
                    break;
                }
            }else if(sound[0] == 8){
                    if(sound[i] - 1 == b) {
                        descending = true;
                        b--;
                    }else{
                        descending = false;
                        System.out.println("mixed");
                        break;
                    }
            }else{
                System.out.println("mixed");
                break;
            }
        }

        if (ascending){
            System.out.println("ascending");
        }else if(descending){
            System.out.println("descending");
        }
    }
    // 2023-03-14
}
