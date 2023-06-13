package boj.silver.silverV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 회사에있는사람_7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 출입 기록 수
        int n = Integer.parseInt(br.readLine());

        // 현재 회사에 있는 사람
        HashSet<String> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            if(st.nextToken().equals("enter")){
                set.add(name);
            }else{
                set.remove(name);
            }
        }

        // 사전의 역순으로 정렬하기 (set을 정렬하기 위해 list에 담기)
        List<String> list = new ArrayList<>();
        list.addAll(set);
        // 정렬 후 역순으로 정렬하기
        Collections.sort(list);
        Collections.reverse(list);

        // 출력하기
        StringBuilder sb = new StringBuilder();
        for(String name : list){
            sb.append(name).append("\n");
        }

        System.out.println(sb);
    }

    // 2023-06-13
}
