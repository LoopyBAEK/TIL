package boj.silver.silverI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 안전영역_2468 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 배열 행과 열의 갯수
        int n = Integer.parseInt(br.readLine());

        // 높이를 저장할 배열
        int[][] hei = new int[n][n];

        // 최대 높이를 구하기 위한 변수
        int maxHei = 0;

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                hei[i][j] = Integer.parseInt(st.nextToken());

                if(hei[i][j] > maxHei) maxHei = hei[i][j];
            }
        }

        // 방문해야할 행과 열의 정보를 저장할 큐
        Queue<Point> q = new LinkedList<>();

        // 방문한 칸마다 살펴볼 위치
        final int[] dr = new int[]{1, -1, 0, 0};
        final int[] dc = new int[]{0, 0, 1, -1};

        // 최대 안전 영역 갯수
        int safe = 0;

        // 0 ~ 최대 높이만큼 돌면서 찾기
        for(int i = 0; i < maxHei; i++) {
            // 방문했던 곳인지 확인하기 위한 배열
            int[][] vis = new int[n][n];

            // 안전 영역 갯수를 세기 위한 변수
            int cnt = 0;

            // BFS 시작
            for(int j = 0; j < n; j++) {
                for(int k = 0; k < n; k++) {
                    // 만약 현재 칸이 비 높이보다 높거나, 방문한 적이 없다면
                    if(hei[j][k] > i && vis[j][k] == 0) {
                        q.offer(new Point(j ,k));
                        vis[j][k] = 1;
                        cnt++;

                        // 더이상 방문할 곳이 없을 때까지
                        while(!q.isEmpty()){
                            Point curr = q.poll();

                            for(int dir = 0; dir < 4; dir++) {
                                int nr = curr.r + dr[dir];
                                int nc = curr.c + dc[dir];

                                // 해당 인덱스가 n을 넘으면
                                if(nr < 0 || nr >= n || nc < 0 || nc >= n) continue;
                                // 이미 방문했던 칸이거나 잠긴 칸일 경우
                                if(vis[nr][nc] == 1 || hei[nr][nc] <= i) continue;

                                vis[nr][nc] = 1;
                                q.offer(new Point(nr, nc));
                            }
                        }
                    }
                }
            }
            if(safe < cnt) safe = cnt;
        }
        System.out.println(safe);
    }
    static class Point{
        int r;
        int c;

        public Point(int r, int c){
            this.r = r;
            this.c = c;
        }
    }

    // 2023-07-27
}

