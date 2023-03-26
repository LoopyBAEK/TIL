package boj.silver.silverI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 그림_1926 {
    public static void main(String[] args) throws IOException {
        // 입출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 세로 크기
        int n = Integer.parseInt(st.nextToken());
        // 가로 크기
        int m = Integer.parseInt(st.nextToken());

        // 시작점부터의 넓이를 저장할 배열
        int[][] dist = new int[n][m];
        // 방문한 위치를 저장할 큐
        Queue<Point> queue = new LinkedList<>();

        // 4방향 탐색을 위한 배열
        int[] dr = {1, -1, 0, 0};
        int[] dc = {0, 0, 1, -1};

        // 그림 갯수
        int art = 0;
        // 그림 넓이
        int area = 0;

        // 그림 정보 받기
        int[][] map = new int[n][m];
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

//        System.out.println(Arrays.deepToString(map));

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(map[i][j] == 0 || dist[i][j] > 0) continue;
                // 시작점(i, j) 담고, 방문 정보 기록
                queue.offer(new Point(i, j));
                dist[i][j] = 1;
                // 그림 개수 카운트
                art++;

                int curArea = 1;
                // 큐가 빌 때까지 반복
                while (!queue.isEmpty()){
                    // 방문했던 위치
                    Point curr = queue.poll();

                    // 4방향 탐색
                    for(int dir = 0; dir < 4; dir++){
                        // 인접한 칸
                        int nr = curr.r + dr[dir];
                        int nc = curr.c + dc[dir];

                        // 그림 영역이 아닐 시 continue
                        if(nr < 0 || nr >= n || nc < 0 || nc >= m) continue;
                        // 그림이 아니거나 방문했던 곳이면 continue
                        if(map[nr][nc] == 0 || dist[nr][nc] > 0) continue;

                        // 방문할 수 있는 칸이면 좌표 넣기
                        queue.offer(new Point(nr, nc));
                        // 새롭게 방문한 칸의 거리 정보를 갱신하기
                        dist[nr][nc] = dist[curr.r][curr.c] + 1;
                        curArea++;
                    }
                }

                area = Math.max(area, curArea);
            }
        }
        System.out.println(art);
        System.out.println(area);
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
