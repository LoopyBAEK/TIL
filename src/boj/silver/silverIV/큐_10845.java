package boj.silver.silverIV;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 큐_10845 {
    public static void main(String[] args) throws IOException {
        Queue<Integer> queue = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 명령 수
        int n = Integer.parseInt(br.readLine());
        // 명령어
        String command = "";
        // 정수 x
        int x = 0;
        // 마지막 값 확인 위한 변수
        int last = 0;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            command = st.nextToken();
            if(command.equals("push")){
                x = Integer.parseInt(st.nextToken());
                queue.offer(x);
                last = x;
            }else if(command.equals("pop")){
                if(queue.isEmpty()){
                    bw.write(-1 + "\n");
                }else{
                    bw.write(queue.peek() + "\n");
                    queue.poll();
                }
            }else if(command.equals("size")){
                bw.write(queue.size() + "\n");
            }else if(command.equals("empty")){
                if(queue.isEmpty()){
                    bw.write(1 + "\n");
                }else{
                    bw.write(0 + "\n");
                }
            }else if(command.equals("front")){
                if(queue.isEmpty()){
                    bw.write(-1 + "\n");
                }else{
                    bw.write(queue.peek() + "\n");
                }
            }else if(command.equals("back")){
                if(queue.isEmpty()){
                    bw.write(-1 + "\n");
                }else{
                    bw.write(last + "\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }
    // 2023-03-17
}
