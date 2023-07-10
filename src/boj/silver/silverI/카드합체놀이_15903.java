package boj.silver.silverI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class 카드합체놀이_15903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 카드의 개수
        int n = Integer.parseInt(st.nextToken());
        // 카드 합체를 몇 번 하는지
        long m = Long.parseLong(st.nextToken());

        // 카드 정보를 담을 큐
        PriorityQueue<Long> pq = new PriorityQueue<>(new Comparator<Long>() {
            @Override
            public int compare(Long o1, Long o2) {
                // 1. 작은 수가 앞에 오도록
                return o1 < o2 ? -1 : 1;
            }
        });

        // 카드 정보 담기
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            pq.offer(Long.parseLong(st.nextToken()));
        }

        // 카드 합체
        for(int i = 0; i < m; i++){
            long sum = pq.poll() + pq.poll();
            pq.offer(sum);
            pq.offer(sum);
        }

        // 만들 수 있는 가장 작은 점수 출력하기
        long total = 0;
        for(long score : pq){
            total += score;
        }
        System.out.println(total);
    }
}
