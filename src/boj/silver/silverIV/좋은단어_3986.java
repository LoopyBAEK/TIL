package boj.silver.silverIV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 좋은단어_3986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 단어의 수
        int n = Integer.parseInt(br.readLine());

        // 좋은 단어의 수를 세기 위한 변수
        int goodCnt = 0;

        // 단어의 수 만큼 for문 돌면서 좋은 단어 개수 세기
        for(int i = 0; i < n; i++){
            // 단어 받기
            String word = br.readLine();

            // 만약 단어의 길이가 홀수라면
            if(word.length() % 2 == 1){
                // 좋은 단어가 아니므로 건너뛰기
                continue;
            }

            // 단어를 한 글자씩 받기 위한 stack
            Stack<Character> chars = new Stack<>();
            // 첫 글자를 push
            chars.push(word.charAt(0));

            // 단어의 길이만큼 for문을 돌며 짝 비교하기
            for(int j = 1; j < word.length(); j++){
                // 단어의 길이가 0보다 크고 chars 가장 위에 있는 값이 단어의 j번째 값과 같을 경우
                if(chars.size() > 0 && chars.peek() == word.charAt(j)){
                    chars.pop();
                }else{
                    chars.push(word.charAt(j));
                }
            }
//            System.out.println(chars);
            // 만약 chars의 값이 모두 비었다면 좋은 단어
            if(chars.isEmpty()){
                goodCnt++;
            }
        }
        System.out.println(goodCnt);
    }

    // 2023-06-04
}
