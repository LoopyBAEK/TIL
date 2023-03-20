package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 중간값찾기_2063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 정수의 개수
        int n = Integer.parseInt(br.readLine());
        // 정수 정렬을 위해 배열에 넣기
        int[] numbers = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(numbers);

        // 중간값 출력하기
        System.out.println(numbers[n / 2]);
    }
    // 2023-03-19
}
