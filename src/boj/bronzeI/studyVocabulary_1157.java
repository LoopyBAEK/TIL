package boj.bronzeI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class studyVocabulary_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine().toUpperCase();

        // 알파벳 개수를 세기 위한 배열
        int[] alpArray = new int[26];

        // 개수 비교를 위해 정수 선언
        int curr = 0;
        int max = 0;
        
        // 가장 많은 알파벳이 여러 개인지 확인하기 위한 변수
        int equals = 0;
        
        // 가장 많은 알파벳
        int alp = 0;

        // 알파벳을 배열에 할당, 개수 세기
        for(int i = 0; i < word.length(); i++){
            alpArray[word.charAt(i) - 'A']++;
        }

        // 가장 많은 알파벳 찾기
        for(int i = 0; i < alpArray.length; i++){
            curr = alpArray[i];
            if(curr > max){
                max = curr;
                alp = i + 'A';
                curr = 0;
            }else if(curr == max){
                equals = curr;
                curr = 0;
            }
        }

        if(equals != max){  // 가장 많은 알파벳이 여러 개가 아니라면
            System.out.println((char)alp);    // 가장 많은 알파벳 출력
        }else{
            System.out.println("?");    // 여러 개일 시 ? 출력
        }
    }
}

// 2023-03-08