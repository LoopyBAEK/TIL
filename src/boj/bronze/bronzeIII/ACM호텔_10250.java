package boj.bronze.bronzeIII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ACM호텔_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 테스트 케이스 개수
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            // 층
            int h = Integer.parseInt(st.nextToken());
            // 방 수
            int w = Integer.parseInt(st.nextToken());
            // n 번째 손님
            int n = Integer.parseInt(st.nextToken());

            // 층수
            int front = 0;
            // 호수
            int back = 0;
            if(n % h == 0){
                front = h * 100;
                back = n / h;
            }else{
                front = (n % h) * 100;
                back = n / h + 1;
            }
            System.out.println(front + back);
        }
    }
    // 2023-03-20
}
