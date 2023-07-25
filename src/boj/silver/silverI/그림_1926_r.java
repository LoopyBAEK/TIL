package boj.silver.silverI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 그림_1926_r {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 도화지 세로 가로 받기
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 도화지 정보 담을 배열
        int[][] area = new int[n][m];
        // 도화지 정보 담기
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++) {
                area[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 그림의 개수
        int cnt = 0;

        // 가장 넓은 그림의 크기
        int maxSize = 0;

        // BFS 실행

        // 방문한 칸마다 살펴볼 위치
        final int[] dr = new int[]{1, -1, 0, 0};
        final int[] dc = new int[]{0, 0, 1, -1};

        // 방문해야되는 곳 행, 열 정보 큐에 담기
        Queue<Point> q = new LinkedList<>();

        // 방문했던 적 있는 곳 정보 저장
        int[][] vis = new int[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                // 현재 위치가 그림이고, 방문한 적 없으면
                if(area[i][j] == 1 && vis[i][j] == 0) {
                    cnt++;
                    int size = 1;
                    vis[i][j] = 1;
                    q.offer(new Point(i, j));

                    // 방문할 곳이 없을 때까지
                    while(!q.isEmpty()){
                        Point curr = q.poll();

                        for(int dir = 0; dir < 4; dir++) {
                            int nr = curr.r + dr[dir];
                            int nc = curr.c + dc[dir];

                            // 현재 좌표가 n, m을 벗어나면
                            if(nr < 0 || nr >= n || nc < 0 || nc >= m) continue;
                            // 현재 좌표가 그림이 아니거나 방문한 적 있으면
                            if(area[nr][nc] == 0 || vis[nr][nc] == 1) continue;

                            // 위 조건들에 걸리지 않는다면
                            size++;
                            vis[nr][nc] = 1;
                            q.offer(new Point(nr, nc));
                        }
                    }
                    if(size > maxSize) maxSize = size;
                }
            }
        }
        // 답 출력
        System.out.println(cnt);
        System.out.println(maxSize);

    }
    static class Point{
        int r;
        int c;

        public Point(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
}
