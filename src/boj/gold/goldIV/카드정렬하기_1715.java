package boj.gold.goldIV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class 카드정렬하기_1715 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // n
        int n = Integer.parseInt(br.readLine());

        // 카드 정보를 담을 pq
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // 가장 작은 게 앞에 오도록
                return o1 < o2 ? -1 : 1;
            }
        });

        // 카드 정보 담기
        for(int i = 0; i < n; i++){
            pq.offer(Integer.parseInt(br.readLine()));
        }

        // 카드 합치기
        int count = 0;
        while(pq.size() != 1){
            int curr = pq.poll() + pq.poll();
            count += curr;
            pq.offer(curr);
        }

        // 몇 번의 비교를 해야하는지 출력
        System.out.println(count);
    }

    // 2023-07-01
}
