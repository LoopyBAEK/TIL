package boj.대회.제1회유틸컵.Chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class C번_UnionMaplestory {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 캐릭터 갯수
        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> levels = new ArrayList<>();
        for(int i = 0; i < n; i++){
            levels.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(levels, Collections.reverseOrder());

        int union = 0;
        int stat = 0;
        n = Math.min(n, 42);
        for(int i = 0; i < n; i++){
            union += levels.get(i);
            if(levels.get(i) >= 250){
                stat += 5;
            }else if(levels.get(i) >= 200){
                stat += 4;
            }else if(levels.get(i) >= 140){
                stat += 3;
            }else if(levels.get(i) >= 100){
                stat += 2;
            }else if(levels.get(i) >= 60){
                stat += 1;
            }
        }
        System.out.print(union + " " + stat);
    }
}
