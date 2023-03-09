package boj.bronzeI;

import java.util.Arrays;
import java.util.Scanner;

public class 일곱난쟁이_2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 가짜 난쟁이를 찾기 위한 변수
        int fake1 = 0;
        int fake2 = 0;

        // 아홉 난쟁이들의 키 합
        int all = 0;

        // 난쟁이 배열
        int[] dwarfs = new int[9];

        // 난쟁이 키 배열에 할당
        for(int i = 0; i < dwarfs.length; i++){
            dwarfs[i] = sc.nextInt();
            // 아홉 난쟁이들의 키 더하기
            all += dwarfs[i];
        }
        // 할당된 난쟁이 키 할당
        Arrays.sort(dwarfs);

        // 가짜 난쟁이 찾기
        for(int i = 0; i < dwarfs.length; i++){
            boolean isBreak = false;
            for(int j = 0; j < dwarfs.length; j++){
                if(dwarfs[i] + dwarfs[j] == all - 100){
                    fake1 = dwarfs[i];
                    fake2 = dwarfs[j];
                    isBreak = true;
                    break;
                }
            }
            if(isBreak){
                break;
            }
        }

//        System.out.println(fake1);
//        System.out.println(fake2);
        // 진짜 일곱 난쟁이들의 키 출력
        for(int i = 0; i < dwarfs.length; i++){
            if(dwarfs[i] != fake1 && dwarfs[i] != fake2){
                System.out.println(dwarfs[i]);
            }
        }
    }
    // 2023-03-09
}
