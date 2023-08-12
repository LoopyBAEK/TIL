package boj.대회.udpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A번_탁구경기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String winner = "";
        // 달구와 포닉스의 승점
        int x = 0;
        int y = 0;

        for(int i = 0; i < n; i++){
            winner = br.readLine();
            if(winner.equals("D")){
                x++;
                if(x - y == 2){
                    break;
                }
            }else if(winner.equals("P")){
                y++;
                if(y - x == 2){
                    break;
                }
            }
        }
        System.out.printf("%d:%d", x, y);
    }
    // 2023-03-26
}
