package boj.DPC2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A번_과조사하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 동아리 학생들의 수
        int p = Integer.parseInt(br.readLine());

        // 동아리당 학생들의 수를 세기 위한 배열
        int[] club = new int[4];

        // 학생 수 세기
        for(int i = 0; i < p ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            // 학년
            int g = Integer.parseInt(st.nextToken());
            // 반
            int c = Integer.parseInt(st.nextToken());
            // 번호
            int n = Integer.parseInt(st.nextToken());

//            System.out.println("학년: " + g + "반: " + c + "번호: " + n);

            // 1학년이면
            if(g == 1){
                club[3]++;
                // 반이 1반이거나 2반이면 소프트웨어개발과
            }else if(c == 1 || c == 2){
                club[0]++;
                // 반이 3반이면 임베디드소프트웨어개발과
            }else if(c == 3){
                club[1]++;
                // 반이 4반이면 인공지능소프트웨어개발과
            }else if(c == 4){
                club[2]++;
            }
        }
        // 출력
        for(int count : club){
            System.out.println(count);
        }
    }
}
