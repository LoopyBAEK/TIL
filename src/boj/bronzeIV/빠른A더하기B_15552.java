package boj.bronzeIV;

import java.io.*;
import java.util.Arrays;

public class 빠른A더하기B_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++){
            String str = br.readLine();
            String[] numbers = str.split(" ");

            bw.write((Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1])) + "\n"); // 버퍼에 있는 값 전부 출력
        }
        bw.flush(); // 남아있는 데이터 모두 출력
        bw.close(); // 스트림 닫음
        // flush(), close()는 버퍼를 잡아놓았기 때문에 반드시 호출해 뒤처리를 해주어야 함
    }
    // 2023-03-10
}
