package boj.bronze.bronzeII;

import java.util.*;

public class 카드역배치_10804 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 카드 한 줄 세우기
        ArrayList<Integer> cards = new ArrayList<>();
        for(int i = 0; i < 20; i++){
            cards.add(i + 1);
        }

        int a = 0;
        int b = 0;
        // 구간 10개 받기
        for(int i = 0; i < 10; i++){
            a = sc.nextInt() - 1;
            b = sc.nextInt() - 1;

            ArrayList<Integer> copyReverse = new ArrayList<>();
            for(int j = a; j <= b; j++){
                // 뒤집을 카드 순서 복사
                copyReverse.add(cards.get(j));
            }
            Collections.reverse(copyReverse);
//            System.out.println(copyReverse);

            // 카드 뒤집기
            int count = 0;
            for(int k = a; k <= b; k++){
                cards.set(k, copyReverse.get(count));
                count++;
            }
//            System.out.println(cards);
        }

        // 마지막 카드 배치 출력
        for (Integer card : cards) {
            System.out.print(card + " ");
        }
    }
    // 2023-03-10
}
