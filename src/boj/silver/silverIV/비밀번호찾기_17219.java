package boj.silver.silverIV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 비밀번호찾기_17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 저장된 사이트 수
        int n = Integer.parseInt(st.nextToken());
        // 비밀번호를 찾으려는 사이트 수
        int m = Integer.parseInt(st.nextToken());

        // 사이트, 비밀번호 저장할 HashMap
        HashMap<String, String> map = new HashMap<>();
        // 사이트 수 만큼 저장하기
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            //      사이트(key)        비밀번호(value)
            map.put(st.nextToken(), st.nextToken());
        }

        // 비밀번호 찾으려는 사이트 비밀번호 가져오기
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            sb.append(map.get(st.nextToken())).append("\n");
        }

        // 출력
        System.out.println(sb);
    }
}
