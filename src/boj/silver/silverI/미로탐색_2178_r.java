package boj.silver.silverI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 미로탐색_2178_r {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // n, m 받기
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 미로 정보를 담을 배열
        int[][] maze = new int[n][m];

        // 미로 정보 담기
        for(int i = 0; i < n; i++) {
            String str = br.readLine();
            for(int j = 0; j < m; j++) {
                maze[i][j] = Integer.parseInt(String.valueOf(str.charAt(j)));
            }
        }

        // 미로 정보 확인
//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < m; j++){
//                System.out.print(maze[i][j]);
//            }
//            System.out.println();
//        }

        // BFS

        // 살펴볼 방향
        final int[] dr = new int[]{1, -1, 0, 0};
        final int[] dc = new int[]{0, 0, 1, -1};

        // 방문했던 곳의 거리를 계산할 배열
        int[][] vis = new int[n][m];

        // 방문해야할 곳의 정보를 저장
        Queue<Point> q = new LinkedList<>();

        q.offer(new Point(0, 0));
        vis[0][0] = 1;

        // 더이상 방문할 곳이 없을 때까지
        while(!q.isEmpty()){
            Point curr = q.poll();

            for(int dir = 0; dir < 4; dir++){
                int nr = curr.r + dr[dir];
                int nc = curr.c + dc[dir];

                // 현재 칸이 maze 인덱스를 넘으면
                if(nr < 0 || nr >= n || nc < 0 || nc >= m) continue;
                // 현재 칸에 이미 방문한 적 있거나, 방문할 수 없는 곳이면
                if(vis[nr][nc] != 0 || maze[nr][nc] == 0) continue;

                q.offer(new Point(nr, nc));
                vis[nr][nc] = vis[curr.r][curr.c] + 1;
            }
        }
        // 거리 출력
        System.out.println(vis[n - 1][m - 1]);
    }
    static class Point {
        int r;
        int c;

        public Point(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
}
