package boj.silver.silverI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 영역구하기_2583 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // M, N, K 받기
        // 행
        int m = Integer.parseInt(st.nextToken());
        // 열
        int n = Integer.parseInt(st.nextToken());
        // 직사각형 갯수
        int k = Integer.parseInt(st.nextToken());

        // 모눈종이 영역
        int[][] area = new int[n][m];

        // 모눈종이에 직사각형 그리기
        for(int i = 0; i < k; i++){
            st = new StringTokenizer(br.readLine());
            // 직사각형 왼쪽 아래 꼭짓점 좌표
            int y1 = Integer.parseInt(st.nextToken());
            int x1 = Integer.parseInt(st.nextToken());
            // 직사각형 오른쪽 위 꼭짓점 좌표
            int y2 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());

            for(int y = y1; y < y2; y++){
                for(int x = x1; x < x2; x++){
                    area[y][x] = 1;
                }
            }
        }

        // BFS 실행

        // 동, 서, 남, 북 탐색을 위한 배열
        final int[] dr = new int[]{1, -1, 0, 0};
        final int[] dc = new int[]{0, 0, 1, -1};

        // 다음에 방문해야할 행, 열 정보를 저장하는 큐
        Queue<Point> q = new LinkedList<>();

        // 방문했던 정보를 남기기 위한 배열
        int[][] vis = new int[n][m];

        // 영역의 갯수를 셀 변수
        int cnt = 0;

        // 영역의 넓이를 저장할 배열
        List<Integer> size = new ArrayList<>();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                // 만약 한 번도 방문하지 않았고 직사각형 영역이 아니라면
                if(vis[i][j] == 0 && area[i][j] == 0){
                    q.offer(new Point(i, j));
                    vis[i][j] = 1;
                    int currSize = 1;
                    cnt++;

                    // 더는 방문할 곳이 없을 때까지
                    while(!q.isEmpty()){
                        Point curr = q.poll();

                        for(int dir = 0; dir < 4; dir++){
                            int nr = curr.r + dr[dir];
                            int nc = curr.c + dc[dir];

                            // 현재 칸이 인덱스를 넘어가면
                            if(nr < 0 || nr >= n || nc < 0 || nc >= m) continue;
                            // 이미 방문한 적 있거나 방문할 수 없는 칸이면
                            if(vis[nr][nc] == 1 || area[nr][nc] == 1) continue;

                            q.offer(new Point(nr, nc));
                            vis[nr][nc] = 1;
                            currSize++;
                        }
                    }
                    size.add(currSize);
                }
            }
        }
        System.out.println(cnt);

        Collections.sort(size);
        StringBuilder sb = new StringBuilder();
        for(int curr : size){
            sb.append(curr).append(" ");
        }
        System.out.println(sb);
    }

    static class Point{
        int r;
        int c;

        public Point(int r, int c){
            this.r = r;
            this.c = c;
        }
    }
}
