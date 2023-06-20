package boj.silver.silverV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 좌표정렬하기_11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 점의 개수
        int n = Integer.parseInt(br.readLine());

        List<int[]> points = new ArrayList<>();

        // 점의 개수만큼
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            points.add(new int[] {x, y});
        }

        // 1순위 : x 증가하는 순서
        // 2순위 : x가 같으면, y가 증가하는 순서
        Collections.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                // 2 순위
                if(o1[0] == o2[0]) return o1[1] < o2[1] ? -1 : 1;
                // 1 순위
                return o1[0] < o2[0] ? -1 : 1;
            }
        });

        StringBuilder sb = new StringBuilder();
        for(int[] xy : points){
            sb.append(xy[0]).append(" ").append(xy[1]).append("\n");
        }
        System.out.println(sb);
    }

    // 2023-06-20
}
