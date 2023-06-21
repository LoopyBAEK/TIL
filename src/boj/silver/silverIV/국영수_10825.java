package boj.silver.silverIV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 국영수_10825 {

    static class Student{
        String name;
        int korean;
        int english;
        int math;

        public Student(String name, int korean, int english, int math) {
            this.name = name;
            this.korean = korean;
            this.english = english;
            this.math = math;
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 도현이네 반의 학생 수
        int n = Integer.parseInt(br.readLine());

        // 학생 이름, 성적을 담기 위한 map
        List<Student> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            Student student = new Student(st.nextToken(), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            list.add(student);
        }

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // 국어 점수가 같으면 영어 점수가 증가하는 순서로
                if(o1.korean == o2.korean){
                    if(o1.english != o2.english){
                        return o1.english < o2.english ? -1 : 1;
                    }else if(o1.math != o2.math){   // 국어 점수와 영어 점수가 같으면
                        return o1.math > o2.math ? -1 : 1;
                    }else{  // 모든 점수가 같으면
                        return o1.name.compareTo(o2.name) < 0 ? -1 : 1;
                    }
                }

                // 국어 점수가 감소하는 순서로
                return o1.korean > o2.korean ? -1 : 1;
            }
        });

        StringBuilder sb = new StringBuilder();
        for(Student st : list){
            sb.append(st.name).append("\n");
        }
        System.out.println(sb);
    }

    // 2023-06-21
}
