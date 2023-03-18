package boj.silver.silverIV;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class 카드2_2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();
        // 카드 개수
        int n = Integer.parseInt(br.readLine());
        // 자리 바뀔 숫자
        int num = 0;

        // queue에 카드 넣기
        for(int i = 0; i < n; i++){
            queue.offer(i + 1);
        }

        if(n == 1){
            System.out.println(1);
        }else{
            while(queue.size() > 0){
//            System.out.println(queue.size());
                if(queue.size() == 2){
                    // 카드가 2개만 남았을 때, 앞의 카드만 버리기
                    queue.poll();
                    break;
                }else{
                    // 가장 위에 있는 카드 버리기
                    queue.poll();
                    // 그 다음 제일 위에 있는 카드 밑에 넣기
                    queue.offer(queue.peek());
                    // 자리 바꾼 카드 버리기
                    queue.poll();
                }
            }
            System.out.println(queue.peek());
        }
    }
    // 2023-03-17
}
