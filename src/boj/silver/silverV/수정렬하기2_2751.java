package boj.silver.silverV;

import java.io.*;
import java.util.Arrays;

public class 수정렬하기2_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 주어지는 숫자의 개수
        int num = Integer.parseInt(br.readLine());
        // 숫자들을 저장할 배열
        int[] array = new int[num];
        for(int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(br.readLine());
        }

        // 정렬
        Arrays.sort(array);
        // 출력
        for(int i = 0; i < array.length; i++){
            bw.write(array[i] + "\n");
        }
        bw.flush();
        bw.close();
    }

    // 2023-05-31
}
