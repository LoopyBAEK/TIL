package boj.silver.silverIV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 카드_11652 {
    static class Card{
        private long key;
        private long cnt;

        public Card(long key, long cnt) {
            this.key = key;
            this.cnt = cnt;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 준규가 가지고 있는 카드 수
        int n = Integer.parseInt(br.readLine());

        // 카드 중복 거를 map
        Map<Long, Card> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            Long curr = Long.parseLong(br.readLine());

            if(map.containsKey(curr)){
                map.get(curr).cnt++;
            }else{
                Card card = new Card(curr, 1L);
                map.put(curr, card);
            }
        }

        // 카드 정보 담을 list
        List<Card> list = new ArrayList<>();
        for(Card card : map.values()){
            list.add(card);
        }
        Collections.sort(list, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                // 2. 가장 많이 가지고 있는 정수가 여러가지이면
                if(o1.cnt == o2.cnt){
                    return o1.key < o2.key ? -1 : 1;
                }

                // 1. 가장 많이 가지고 있는 정수
                return o1.cnt > o2.cnt ? -1 : 1;
            }
        });

        // 값 확인용
//        for(Card card : list){
//            System.out.println("키: " + card.key);
//            System.out.println("카운트: " + card.cnt);
//        }

        // 가장 많이 가지고 있는 정수 출력
        System.out.println(list.get(0).key);
    }
}
