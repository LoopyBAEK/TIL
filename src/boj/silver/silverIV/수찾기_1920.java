package boj.silver.silverIV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 수찾기_1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<Integer> nList = new HashSet<>();
        for(int i = 0; i < n; i++){
            nList.add(Integer.parseInt(st.nextToken()));
        }

//        System.out.println(nList);
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        // n과 m 비교하기
        for(int i = 0; i < m; i++){
            if(nList.contains(Integer.parseInt(st.nextToken()))){
                System.out.println("1");
            }else{
                System.out.println("0");
            }
        }
    }

    // 2023-06-02
    // HashSet으로 풀었지만
    // 이분탐색을 사용하길 원하는 문제였다.
}
