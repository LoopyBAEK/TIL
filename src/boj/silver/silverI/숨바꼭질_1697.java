package boj.silver.silverI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 숨바꼭질_1697 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 수빈이 위치
        int n = Integer.parseInt(st.nextToken());
        // 동생 위치
        int k = Integer.parseInt(st.nextToken());

        // 위치 파악을 위한 배열
        int[] check = new int[100001];

        // 상, 좌
        int[] mx = {-1, 0};
        int[] my = {0, -1};

        // 위치 정보
        Queue<Integer> queue = new LinkedList<>();

        if(n == k){
            System.out.println(0);
        }else{
            // 수빈이 위치
            queue.offer(n);
            // 현재 위치 값
            check[n] = 1;

            // 큐가 비지 않을 때까지
            while (!queue.isEmpty()){
                // 현재 위치
                int curr = queue.poll();

                // 수빈이와 동생의 위치가 같은지 확인하기 위한 변수
                boolean bool = false;

                // 앞, 뒤, *2
                for(int i = 0; i < 3; i++){
                    int next = 0;
                    if(i == 0){
                        next = curr + 1;
                    }else if(i == 1){
                        next = curr - 1;
                    }else{
                        next = curr * 2;
                    }

                    // next가 k와 같으면 true, for문 나가기
                    if(next == k){
                        bool = true;
                        break;
                    }

                    if(next >= 0 && next < check.length && check[next] == 0){
                        queue.offer(next);
                        check[next] = check[curr] + 1;
                    }
                }

                // 동생에게 도착한 시간을 출력 후 while문 나가기
                if(bool){
                    System.out.println(check[curr]);
                    break;
                }
            }
        }
    }
    // 2023-03-28
}
