package boj.대회.제1회유틸컵.Chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B번_GiftExpireDate {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String today = br.readLine();

        // 기프티콘 갯수
        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        for(int i = 0; i < n; i++){
            String cur = br.readLine();
            if(cur.compareTo(today) >= 0){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
