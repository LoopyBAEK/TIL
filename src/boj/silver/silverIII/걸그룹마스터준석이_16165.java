package boj.silver.silverIII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 걸그룹마스터준석이_16165 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 걸그룹 수
        int n = Integer.parseInt(st.nextToken());

        // 문제 수
        int m = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        // 걸그룹 담기
        HashMap<String, String> map = new HashMap<String, String>();
        for(int i = 0; i < n; i++){
            // 걸그룹 이름
            String name = br.readLine();
            // 멤버 수
            int memberNum = Integer.parseInt(br.readLine());

            for(int j = 0; j < memberNum; j++){
                sb.append(br.readLine()).append(" ");
            }
            // map에 담기
            map.put(name, sb.toString());
            // 비워주기
            sb.setLength(0);
        }
//        System.out.println(map);

        // 문제 풀기
        for(int i = 0; i < m; i++){
            String str = br.readLine();
            int quizType = Integer.parseInt(br.readLine());
//            System.out.println(str);
//            System.out.println(quizType);

            if(quizType == 0){
                // 멤버 이름 담을 리스트
                List<String> members = new ArrayList<>();

                st = new StringTokenizer(map.get(str), " ");
                // 다음 값이 없을 때까지
                while (st.hasMoreTokens()){
                    members.add(st.nextToken());
                }
                // 사전순 정렬
                Collections.sort(members);

                // 출력하기 위해 담기
                for(String name : members){
                    sb.append(name).append("\n");
                }
            }else{
                Iterator<String> it = map.keySet().iterator();
                // 다음 값이 없을 때까지
                while (it.hasNext()){
                    String name = it.next();
//                    System.out.println(name);
                    st = new StringTokenizer(map.get(name), " ");

                    while (st.hasMoreTokens()){
                        String token = st.nextToken();

                        if(str.equals(token)){
                            sb.append(name).append("\n");
//                            System.out.println("name=" + name);
                        }
                    }
                }
            }
        }
        System.out.println(sb);
    }
}
