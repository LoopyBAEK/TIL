package boj.bronze.bronzeV;

import java.util.Scanner;

public class 문자열_9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        // System.out.println(testCase);

        for(int i = 1; i <= testCase; i++){
            String str = sc.next();

            char firstWord = str.charAt(0);
            char lastWord = str.charAt(str.length()-1);
            System.out.println(firstWord + "" + lastWord);
        }

        // 2023-02-06
    }
}
