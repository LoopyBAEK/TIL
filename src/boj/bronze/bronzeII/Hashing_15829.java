package boj.bronze.bronzeII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Hashing_15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int[] alp = new int[l];
        // 문자를 숫자로 배열에 저장
        for(int i = 0; i < l; i++){
            alp[i] = str.charAt(i) - 'a' + 1;
        }

        double sum = 0;
        double square = 1;
        // 배열의 길이만큼 돌면서 계산
        for(int i = 0; i < alp.length; i++){
            sum += alp[i] * square;
            square = (square * 31) % 1234567891;
        }
        System.out.println(sum % 1234567891);
    }
    // 2023-03-20
    // 모듈러의 연산의 성질 중 분배법칙을 사용 -> 최대 길이가 50일 경우 31의 49제곱까지 나오는데 long으론 담을 수 없기 때문(overflow)
}
