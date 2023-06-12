package boj.silver.silverIV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 나는야포켓몬마스터이다솜_1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 포켓몬 수
        int n = Integer.parseInt(st.nextToken());
        // 문제 수
        int m = Integer.parseInt(st.nextToken());

        // 포켓몬을 담을 HashMap
        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        HashMap<String, Integer> map2 = new HashMap<String, Integer>();
        for(int i = 1; i <= n; i++){
            String str = br.readLine();
            map1.put(i, str);
            map2.put(str, i);
        }

        // 문제 출력하기
        for(int i = 0; i < m; i++){
            String str = br.readLine();
            if(map2.get(str) != null){
                System.out.println(map2.get(str));
            }else{
                System.out.println(map1.get(Integer.parseInt(str)));
            }
        }
    }

    // 2023-06-12
}
