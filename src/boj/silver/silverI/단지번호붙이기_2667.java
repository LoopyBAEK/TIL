package boj.silver.silverI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 단지번호붙이기_2667 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 지도의 크기
        int n = Integer.parseInt(br.readLine());

        // 지도 정보
        int[][] map = new int[n][n];
        // 지도 정보 담기
        for(int i = 0; i < n; i++){
            String line = br.readLine();
            for(int j = 0; j < n; j++){
                map[i][j] = Integer.parseInt(String.valueOf(line.charAt(j)));
            }
        }

        // BFS
        //방문해야 할 곳 정보
        Queue<Point> q = new LinkedList<>();

        // 방문한 칸마다 살펴볼 위치
        final int[] dr = new int[]{1, -1, 0, 0};
        final int[] dc = new int[]{0, 0, 1, -1};

        // 방문 여부 저장
        int[][] vis = new int[n][n];

        // 단지 갯수
        int cnt = 0;

        // 집의 갯수를 저장할 list
        ArrayList<Integer> list = new ArrayList<>();

        // BFS 시작
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                // 현재 있는 곳이 집이고, 방문한 적이 없으면
                if(map[i][j] == 1 && vis[i][j] == 0){
                    // 집의 갯수
                    int house = 1;
                    cnt++;
                    vis[i][j] = 1;
                    q.offer(new Point(i, j));

                    while(!q.isEmpty()){
                        Point curr = q.poll();
                        for(int dir = 0; dir < 4; dir++){
                            int nr = curr.r + dr[dir];
                            int nc = curr.c + dc[dir];

                            // 만약 현재 있는 곳이 map을 벗어나면
                            if(nr >= n || nr < 0 || nc >= n || nc < 0) continue;
                            // 집이 아니거나 이미 들렀던 곳이면
                            if(map[nr][nc] == 0 || vis[nr][nc] == 1) continue;

                            vis[nr][nc] = 1;
                            house++;
                            q.offer(new Point(nr, nc));
                        }
                    }
                    list.add(house);
                }
            }
        }
        Collections.sort(list);

        System.out.println(cnt);
        for(int curr : list){
            System.out.println(curr);
        }
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
