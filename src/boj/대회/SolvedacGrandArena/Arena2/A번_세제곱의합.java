package boj.대회.SolvedacGrandArena.Arena2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A번_세제곱의합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int square = 0;
        int cubic = 0;

        for(int i = 1; i <= n; i++){
            square += i;
            cubic += i * i * i;
        }

        System.out.println(square);
        System.out.println(square * square);
        System.out.println(cubic);
    }
}
