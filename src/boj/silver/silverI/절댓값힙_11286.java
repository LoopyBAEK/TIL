package boj.silver.silverI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class 절댓값힙_11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 연산의 개수
        int n = Integer.parseInt(br.readLine());

        // 연산에 대한 정보를 담을 PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // 2. 절댓값이 가장 작은 것이 여러 개일 때, 가장 작은 수가 우선 순위이다.
                if(Math.abs(o1) == Math.abs(o2)){
                    return o1 < o2 ? -1 : 1;
                }

                // 1. 절댓값이 가장 작은 값이 우선 순위이다.
                return Math.abs(o1) < Math.abs(o2) ? -1 : 1;
            }
        });

        // 연산 정보 pq에 담고, 출력하기
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            int curr = Integer.parseInt(br.readLine());

            // 입력 받은 값이 0이 아니면 pq에 담고, 0이면 가장 작은 값 출력하고 제거하기
            if(curr != 0){
                pq.offer(curr);
            }else{
                // pq가 비었으면 0 출력
                if(pq.isEmpty()){
                    sb.append(0).append("\n");
                }else{
                    sb.append(pq.poll()).append("\n");
                }
            }
        }
        System.out.println(sb);
    }

    // 2023-06-26
    // 우선순위 큐를 사용해보았다.
}
