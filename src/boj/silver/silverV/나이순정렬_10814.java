package boj.silver.silverV;

import java.io.*;
import java.util.*;

public class 나이순정렬_10814 {

    // 회원 정보를 담을 static class
    static class User{
        // 나이
        private int age;
        // 이름
        private String name;
        // 가입한 순서
        private int join;

        public User(int age, String name, int join) {
            this.age = age;
            this.name = name;
            this.join = join;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 가입한 멤버의 정보를 저장할 list
        List<User> list = new ArrayList<>();
        // 가입한 순서를 저장하기 위한 int
        int join = 1;
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            // User의 나이와 이름, 가입순서를 받아서 저장 후 list에 담아주기
            User user = new User(Integer.parseInt(st.nextToken()), st.nextToken(), join);
            list.add(user);
            join++;
        }

        // 나이순, 나이가 같으면 가입한 순으로 정렬
        Collections.sort(list, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                // 2. 나이가 같으면 가입순으로
                if(o1.age == o2.age){
                    return o1.join < o2.join ? -1 : 1;
                }

                // 1. 나이순으로
                return o1.age < o2.age ? -1 : 1;
            }
        });

        // 출력하기
        StringBuilder sb = new StringBuilder();
        for(User info : list){
            sb.append(info.age).append(" ").append(info.name).append("\n");
        }
        System.out.println(sb);
    }
}
