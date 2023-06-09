package boj.silver.silverIV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 접미사배열_11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 주어진 문자열
        String s = br.readLine();

        // s를 한 글자씩 배열에 담기
        List<Character> chars = new ArrayList<>(s.length());
        for(int i = 0; i < s.length(); i++){
            chars.add(s.charAt(i));
        }

        // 접미사 배열
        String[] words = new String[s.length()];
        for(int i = 0; i < words.length; i++){
            StringBuilder word = new StringBuilder();
            for(int j = 0; j < chars.size(); j++){
                word.append(chars.get(j));
            }
            words[i] = String.valueOf(word);
            chars.remove(0);
        }
        Arrays.sort(words);

        StringBuilder sb = new StringBuilder();
        for(String word : words){
            sb.append(word).append("\n");
        }

        System.out.println(sb);
    }

    // 2023-06-09
}
