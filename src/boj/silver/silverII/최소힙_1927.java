package boj.silver.silverII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class 최소힙_1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 연산의 개수
        int n = Integer.parseInt(br.readLine());

        // 연산 정보를 담을 pq
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // 1. 가장 작은 값이 앞에 오기
                return o1 < o2 ? -1 : 1;
            }
        });

        // pq에 담고, 출력하기
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            int curr = Integer.parseInt(br.readLine());
            if(curr != 0 && curr > 0){
                pq.offer(curr);
            }else if(curr == 0){
                if(pq.isEmpty()){
                    sb.append(0).append("\n");
                }else{
                    sb.append(pq.poll()).append("\n");
                }
            }
        }
        System.out.println(sb);
    }

    // 2023-06-27
}
