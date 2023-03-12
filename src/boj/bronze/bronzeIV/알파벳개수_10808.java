package boj.bronze.bronzeIV;

import java.util.Scanner;

public class 알파벳개수_10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] alp = new int[26];

        // 각 알파벳의 갯수 세기
        for(int i = 0; i < s.length(); i++){
            alp[s.charAt(i) - 'a']++;
        }

        // 알파벳 갯수 출력
        for(int i = 0; i < alp.length; i++){
            System.out.print(alp[i] + " ");
        }
    }
    // 2023-03-12
}
