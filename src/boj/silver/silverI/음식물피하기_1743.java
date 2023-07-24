package boj.silver.silverI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 음식물피하기_1743 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 통로의 세로 길이
        int n = Integer.parseInt(st.nextToken());
        // 통로의 가로 길이
        int m = Integer.parseInt(st.nextToken());
        // 떨어진 음식물 쓰레기 개수
        int k = Integer.parseInt(st.nextToken());

        // 통로의 정보를 담을 배열
        int[][] aisle = new int[n][m];
        
        // 통로의 정보를 담기
        for(int i = 0; i < k; i++){
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            
            // 음식물 쓰레기의 좌표에 음식물이 있다는 것을 표시하기 위해 1로 할당
            aisle[r - 1][c - 1] = 1;
        }

        // BFS 실행
        // 방문해야 하는 행, 열의 정보를 저장할 큐
        Queue<Point> q = new LinkedList<>();

        // 방문한 칸마다 살펴볼 위치
        final int[] dr = new int[]{1, -1, 0, 0};
        final int[] dc = new int[]{0, 0, 1, -1};

        // 방문했던 정보를 담을 배열
        int[][] vis = new int[n][m];

        // 가장 큰 음식물 쓰레기의 사이즈를 계산하기 위한 변수
        int maxSize = 0;

        // 탐색 시작
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                // 만약 현재 칸에 음식물 쓰레기가 있고, 처음 방문할 경우
                if(aisle[i][j] == 1 && vis[i][j] == 0){
                    // 현재 구역의 사이즈 추가
                    int currSize = 1;
                    // 방문 기록 남기기
                    vis[i][j] = 1;
                    // 큐에 현재 좌표 넣기
                    q.offer(new Point(i, j));

                    // 더이상 방문할 칸이 없을 때까지
                    while(!q.isEmpty()){
                        Point curr = q.poll();
                        // 인접한 4방향에 대해서 탐색하기
                        for(int dir = 0; dir < 4; dir++){
                            int nr = curr.r + dr[dir];
                            int nc = curr.c + dc[dir];

                            // 지금 보고 있는 칸이 인덱스의 바깥이면
                            if(nr < 0 || nr >= n || nc < 0 || nc >= m) continue;
                            // 지금 보고 있는 칸이 음식물 쓰레기가 아니거나 이미 방문했던 경우
                            if(aisle[nr][nc] == 0 || vis[nr][nc] == 1) continue;

                            // 위 조건에 걸리지 않으면
                            currSize++;
                            vis[nr][nc] = 1;
                            q.offer(new Point(nr, nc));
                        }
                    }
                    // 만약 currSize가 maxSize보다 크면
                    if(currSize > maxSize){
                        maxSize = currSize;
                    }
                }
            }
        }
        // 가장 큰 음식물 쓰레기 사이즈 출력
        System.out.println(maxSize);
    }

    static class Point{
        int r;
        int c;

        public Point(int r, int c){
            this.r = r;
            this.c = c;
        }
    }

    // 2023-07-24
}
