package boj.bronze.bronzeII;

import java.util.Arrays;
import java.util.Scanner;

public class Strfry_11328 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 테스트 케이스 수
        int n = sc.nextInt();

        // 문자열 배열 담기
        for(int i = 0; i < n; i++) {
            char[] str1 = sc.next().toCharArray();
            char[] str2 = sc.next().toCharArray();
            Arrays.sort(str1);
            Arrays.sort(str2);

            boolean bool = false;
            for (int k = 0; k < str1.length; k++) {
                if (str1[k] == str2[k]) {
                    bool = true;
                } else {
                    bool = false;
                    break;
                }
            }

            if (bool) {
                System.out.println("Possible");
            } else {
                System.out.println("Impossible");
            }
        }
    }
    // 2023-03-14
}
