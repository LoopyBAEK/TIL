package boj.gold.goldIV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class 파일합치기3_13975 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 테스트 데이터 개수
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++){
            // 소설을 구성하는 장의 수
            int k = Integer.parseInt(br.readLine());

            // 비용
            long price = 0;

            // 파일 합치기 위해 pq 사용
            PriorityQueue<Long> pq = new PriorityQueue<>(new Comparator<Long>() {
                @Override
                public int compare(Long o1, Long o2) {
                    // 제일 작은 수가 앞에 오도록
                    return o1 < o2 ? -1 : 1;
                }
            });

            // 파일 pq에 저장하기
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < k; j++){
                pq.offer(Long.parseLong(st.nextToken()));
            }

            // 파일 합치며 비용 계산하기
            while(pq.size() != 1){
                long merge = pq.poll() + pq.poll();
                price += merge;

                // 합친 파일을 다시 pq에 담아주기
                pq.offer(merge);
            }
            sb.append(price).append("\n");
        }
        System.out.println(sb);
    }

    // 2023-06-29
}
