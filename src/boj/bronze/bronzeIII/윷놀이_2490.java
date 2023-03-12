package boj.bronze.bronzeIII;

import java.util.Scanner;

public class 윷놀이_2490 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 3; i++) { // 윷가락은 4개니까 4번 돌리기
            int total = 0;  // 등, 배 계산 후 결과 출력을 위한 변수 선언
            String[] curr = sc.nextLine().split(" ");
            for (int j = 0; j < 4; j++) {
                if (curr[j].equals("1")) {
                    total++;
                }
            }

            // 도, 개, 걸, 윷, 모 구분하여 출력하기
            switch (total) {
                case 0:
                    System.out.println("D");    // 윷
                    break;
                case 1:
                    System.out.println("C");    // 걸
                    break;
                case 2:
                    System.out.println("B");    // 개
                    break;
                case 3:
                    System.out.println("A");    // 도
                    break;
                default:
                    System.out.println("E");    // 모
                    break;
            }
        }
    }
}
