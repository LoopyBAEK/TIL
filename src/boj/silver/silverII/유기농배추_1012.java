package boj.silver.silverII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 유기농배추_1012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 테스트 케이스 수
        int t = Integer.parseInt(br.readLine());

        for(int test = 0; test < t; test++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            // 배추밭 가로 길이
            int m = Integer.parseInt(st.nextToken());
            // 배추밭 세로 길이
            int n = Integer.parseInt(st.nextToken());
            // 배추 위치 개수
            int k = Integer.parseInt(st.nextToken());

            // 배추 위치 저장할 배열
            int[][] cabbage = new int[n][m];

            // 배추 위치 저장
            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                cabbage[y][x] = 1;
            }

            // 배추 위치가 잘 저장되었는지 확인
            //        for(int i = 0; i < n; i++){
            //            for(int j = 0; j < m; j++){
            //                System.out.print(cabbage[i][j]);
            //            }
            //            System.out.println();
            //        }

            //  BFS 시작

            // 다음에 방문해야 하는 행, 열 정보를 저장하는 큐
            Queue<Point> q = new LinkedList<>();

            // 방문했는지 여부를 저장할 배열
            int vis[][] = new int[n][m];

            // 배추가 모여있는 구역의 개수
            int cnt = 0;

            // 방문한 칸마다 살펴볼 위치
            final int[] dr = new int[]{1, -1, 0, 0};
            final int[] dc = new int[]{0, 0, 1, -1};

            // 가능한 모든 시작점에 대해서 BFS 시작
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    // BFS를 시작할 수 있는 칸이라면 (배추이면서 처음 방문하는 칸)
                    if (cabbage[i][j] == 1 && vis[i][j] == 0) {
                        cnt++;  // 구역 개수 세기
                        vis[i][j] = 1;  // 방문했다고 표시하기
                        q.offer(new Point(i, j));   // 현재 위치를 큐에 담기

                        // 더이상 방문할 곳(배추가 있는 곳)이 없을 때까지
                        while (!q.isEmpty()) {
                            Point curr = q.poll();
                            // 인접한 4방향에 대해서 아래의 과정을 수행(방문)
                            for (int dir = 0; dir < 4; dir++) {
                                int nr = curr.r + dr[dir];
                                int nc = curr.c + dc[dir];

                                // 지금 보고 있는 curr의 인접한 칸이 2차원 배열 밖의 인덱스이면
                                if (nr < 0 || nr >= n || nc < 0 || nc >= m) continue;
                                // 지금 보고 있는 curr의 인접한 칸이 배추가 아니거나 방문한 적 있으면
                                if (vis[nr][nc] == 1 || cabbage[nr][nc] == 0) continue;

                                // 위의 if를 모두 통과했다면 배추이면서 새로 방문한 칸
                                // 인접한 칸을 방문했다고 저장하고 큐에 넣기
                                vis[nr][nc] = 1;
                                q.offer(new Point(nr, nc));
                            }
                        }
                    }
                }
            }
            sb.append(cnt).append("\n");
        }
        // 테스트 케이스 마다 필요한 지렁이 개수 출력
        System.out.println(sb);
    }

    static class Point {
        int r;
        int c;

        public Point(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }

    // 2023-07-24
}
