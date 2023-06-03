package boj.silver.silverIV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class 덱_10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 명령의 수
        int n = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new LinkedList<>();
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            if(order.equals("push_back")){
                deque.offer(Integer.parseInt(st.nextToken()));
            }else if(order.equals("push_front")) {
                deque.offerFirst(Integer.parseInt(st.nextToken()));
            }else if(order.equals("pop_back")) {
                if (deque.peekLast() != null) {
                    System.out.println(deque.pollLast());
                } else {
                    System.out.println("-1");
                }
            }else if(order.equals("pop_front")) {
                if (deque.peek() != null) {
                    System.out.println(deque.poll());
                } else {
                    System.out.println("-1");
                }
            }else if(order.equals("size")) {
                System.out.println(deque.size());
            }else if(order.equals("empty")){
                if(deque.isEmpty()){
                    System.out.println("1");
                }else{
                    System.out.println("0");
                }
            }else if(order.equals("front")){
                if(deque.peek() != null){
                    System.out.println(deque.peek());
                }else{
                    System.out.println("-1");
                }
            }else if(order.equals("back")){
                if(deque.peekLast() != null){
                    System.out.println(deque.peekLast());
                }else{
                    System.out.println("-1");
                }
            }
        }
    }

    // 2023-06-03
}
