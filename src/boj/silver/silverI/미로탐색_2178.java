package boj.silver.silverI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 미로탐색_2178 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 미로 받기
        char[][] map = new char[n][m];
        for(int i = 0; i < n; i++){
            map[i] = br.readLine().toCharArray();
        }

        // 상하좌우 비교할 배열
        int[] dr = {1, -1, 0, 0};
        int[] dc = {0, 0, 1, -1};

        // 방문 기록
        int[][] dist = new int[n][m];
        Queue<Point> queue = new LinkedList<>();

        // 시작점
        dist[0][0] = 1;
        queue.offer(new Point(0, 0));

        while(!queue.isEmpty()){
            Point curr = queue.poll();

            for(int dir = 0; dir < 4; dir++){
                int nr = curr.r + dr[dir];
                int nc = curr.c + dc[dir];

                if(nr < 0 || nr >= n || nc < 0 || nc >= m) continue;
                if(map[nr][nc] == '0' || dist[nr][nc] > 0) continue;

                dist[nr][nc] = dist[curr.r][curr.c] + 1;
                queue.offer(new Point(nr, nc));
            }
        }
        System.out.println(dist[n - 1][m - 1]);
    }

    static class Point{
        int r, c;

        public Point(int r, int c){
            this.r = r;
            this.c = c;
        }
    }
    // 2023-03-25
}
