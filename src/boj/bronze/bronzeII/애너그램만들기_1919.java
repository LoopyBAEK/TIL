package boj.bronze.bronzeII;

import java.util.Scanner;

public class 애너그램만들기_1919 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 두 단어 받기
        char[] chars1 = sc.next().toCharArray();
        char[] chars2 = sc.next().toCharArray();
        // 두 단어가 가진 알파벳을 비교하기 위해 배열 선언
        int[] alp1 = new int[26];
        int[] alp2 = new int[26];
        // 지울 알파벳 세기 위한 변수
        int different = 0;

        // chars1의 알파벳 세기
        for (char c : chars1) {
            alp1[c - 'a']++;
        }

        // chars2의 알파벳 세기
        for (char c : chars2) {
            alp2[c - 'a']++;
        }

        // 지울 알파벳 개수 세기
        for(int i = 0; i < 26; i++){
            if(alp1[i] != alp2[i]){
                if(alp1[i] > alp2[i]){
                    different += alp1[i] - alp2[i];
                }else if(alp1[i] < alp2[i]){
                    different += alp2[i] - alp1[i];
                }
            }
        }

        // 지울 알파벳 개수 출력
        System.out.println(different);
    }
    // 2023-03-14
}
