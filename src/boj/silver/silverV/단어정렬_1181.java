package boj.silver.silverV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 단어정렬_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        // 단어의 개수
        int num = Integer.parseInt(br.readLine());

        // 단어를 담을곳
        Set<String> words = new HashSet<>();

        // 단어 담기 (Set을 이용해 중복된 단어 저장되지 않게 하기)
        while(num-- > 0) words.add(br.readLine());

        List<String> wordList = new ArrayList<>(words);

        Collections.sort(wordList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 2. 길이가 같으면 사전순으로
                if(o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                // 1. 길이가 짧은 것부터
                return o1.length() < o2.length() ? -1 : 1;
            }
        });

        for(String s : wordList) sb.append(s).append("\n");

        System.out.println(sb);
    }
}
