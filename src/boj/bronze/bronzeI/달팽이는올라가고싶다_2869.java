package boj.bronze.bronzeI;

import java.io.*;
import java.util.StringTokenizer;

public class 달팽이는올라가고싶다_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 낮에 달팽이가 올라가는 높이
        int a = Integer.parseInt(st.nextToken());
        // 밤에 달팽이가 미끄러지는 높이
        int b = Integer.parseInt(st.nextToken());
        // 목표 높이
        int v = Integer.parseInt(st.nextToken());

        // 목표 높이까지 걸리는 날
        System.out.printf("%d", (v-b) % (a-b) == 0 ? (v-b) / (a-b) : (v-b) / (a-b) + 1);
    }
    // 2023-03-22
}
