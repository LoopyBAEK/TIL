package boj.gold.goldV;

import godOfJava.accessModifier.c.inheritance.ToString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 토마토_7576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 토마토 상자의 가로 칸의 수
        int m = Integer.parseInt(st.nextToken());
        // 토마토 상자의 세로 칸의 수
        int n = Integer.parseInt(st.nextToken());

        // 상하좌우 비교
        int[] dr = {1, -1, 0, 0};
        int[] dc = {0, 0, 1, -1};

        Queue<Point> queue = new LinkedList<>();

        // 토마토 저장
        int[][] tomatos = new int[n][m];
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++){
                tomatos[i][j] = Integer.parseInt(st.nextToken());
                if(tomatos[i][j] == 1){
                    queue.offer(new Point(i, j));
                }
            }
        }

        while (!queue.isEmpty()){
            Point curr = queue.poll();

            // 상하좌우
            for(int dir = 0; dir < 4; dir++){
                int nr = curr.r + dr[dir];
                int nc = curr.c + dc[dir];

                if(nr >= 0 && nr < n && nc >= 0 && nc < m){
                    // 토마토가 안 익었으면
                    if(tomatos[nr][nc] == 0){
                        // 큐에 추가
                        queue.offer(new Point(nr, nc));
                        // 날짜 구하기
                        tomatos[nr][nc] = tomatos[curr.r][curr.c] + 1;
                    }
                }
            }
        }

        int result = 0;
        boolean bool = true;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(tomatos[i][j] == 0){
                    bool = false;
                }
                result = Math.max(result, tomatos[i][j]);
            }
        }

        if(bool){
            System.out.println(result - 1);
        }else{
            System.out.println(-1);
        }


    }


    static class Point{
        int r, c;

        public Point(int r, int c){
            this.r = r;
            this.c = c;
        }
    }

    // 2023-03-28
}
