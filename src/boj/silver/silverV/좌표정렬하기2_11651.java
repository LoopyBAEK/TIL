package boj.silver.silverV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 좌표정렬하기2_11651 {
    static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 점의 개수
        int n = Integer.parseInt(br.readLine());

        List<Point> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            Point p = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));

            list.add(p);
        }
        Collections.sort(list, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                if(o1.y == o2.y) return o1.x < o2.x ? -1 : 1;
                return o1.y < o2.y ? -1 : 1;
            }
        });

        StringBuilder sb = new StringBuilder();
        for(Point p : list){
            sb.append(p.x).append(" ").append(p.y).append("\n");
        }
        System.out.println(sb);
    }

    // 2023-06-20
}
