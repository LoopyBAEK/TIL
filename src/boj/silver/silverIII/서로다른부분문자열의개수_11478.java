package boj.silver.silverIII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class 서로다른부분문자열의개수_11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 문자열 s
        String s = br.readLine();

        // 한 글자씩 담기
        char[] chars = new char[s.length()];
        for(int i = 0; i < s.length(); i++){
            chars[i] = s.charAt(i);
        }

        // 중복 제거를 위해 set
        HashSet<String> hashSet = new HashSet<>();

        // 문자열부터 넣기
        for(char ch : chars){
            hashSet.add(String.valueOf(ch));
        }
//        System.out.println(hashSet);    --> [a, b, c]

        // hashset에 담기
        for(int i = 0; i < chars.length - 1; i++){
            StringBuilder sb = new StringBuilder();
            sb.append(chars[i]);
            for(int j = i + 1; j < chars.length; j++){
                sb.append(chars[j]);

                hashSet.add(String.valueOf(sb));
            }
        }

//        System.out.println(hashSet);
        System.out.println(hashSet.size());
    }

    // 2023-06-15
}
