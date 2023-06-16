package boj.silver.silverIII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 수강신청_13414 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 수강 가능 인원
        int k = Integer.parseInt(st.nextToken());

        // 수강 신청 버튼 클릭한 학생 수
        int l = Integer.parseInt(st.nextToken());

        // 수강 신청한 학생 목록 담기 위한 LinkedHashSet --> 순서 유지를 위해
        Set<String> students = new LinkedHashSet<>();
        for(int i = 0; i < l; i++){
            String student = br.readLine();
            if(students.contains(student)){
                students.remove(student);
            }
            students.add(student);
        }

        // 출력
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(String student : students){
            sb.append(student).append("\n");
            count++;
            if(count >= k) break;
        }
        System.out.println(sb);
    }
}
