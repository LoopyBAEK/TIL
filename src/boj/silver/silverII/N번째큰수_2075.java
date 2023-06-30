package boj.silver.silverII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class N번째큰수_2075 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // n
        int n = Integer.parseInt(br.readLine());

        // nxn의 정보를 담기 위한 pq
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // 1. 가장 큰 수가 앞에 오도록
                return o1 > o2 ? -1 : 1;
            }
        });

        // pq에 담기
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++){
                pq.offer(Integer.parseInt(st.nextToken()));
            }
        }

        // n번째 큰 수 출력
        int nBig = 0;
        for(int i = 1; i <= n; i++){
            if(i != n){
                pq.poll();
            }else{
                nBig = pq.poll();
            }
        }
        System.out.println(nBig);
    }

    // 2023-06-30
}
