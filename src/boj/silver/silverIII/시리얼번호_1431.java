package boj.silver.silverIII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class 시리얼번호_1431 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 기타의 개수
        int n = Integer.parseInt(br.readLine());

        // 시리얼 번호 담을 리스트
        List<char[]> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            char[] ch = br.readLine().toCharArray();
            list.add(ch);
        }
        Collections.sort(list, new Comparator<char[]>() {
            @Override
            public int compare(char[] o1, char[] o2) {
                // A와 B의 길이가 같다면, 모든 자리수의 합이 작은 게 먼저 온다.
                if(o1.length == o2.length){
                    int sumO1 = 0;
                    int sumO2 = 0;
                    for(char ch : o1){
                        if(Character.isDigit(ch)){  // 명시된 char 값이 숫자인지 여부를 판단하여 true나 false 리턴
                            sumO1 += Integer.parseInt(String.valueOf(ch));
                        }
                    }
                    for(char ch : o2){
                        if(Character.isDigit(ch)){
                            sumO2 += Integer.parseInt(String.valueOf(ch));
                        }
                    }

                    if(sumO1 != sumO2) {
                        return sumO1 < sumO2 ? -1 : 1;
                    }else {  // 두 가지 조건들로 비교할 수 없으면 사전순
                        StringBuilder strO1 = new StringBuilder();
                        StringBuilder strO2 = new StringBuilder();
                        for(char ch : o1){
                            strO1.append(ch);
                        }
                        for(char ch : o2){
                            strO2.append(ch);
                        }

                        if(strO1.compareTo(strO2) < 0){
                            return -1;
                        }else{
                            return 1;
                        }
                    }
                }

                // A와 B의 길이가 다르면 짧은 게 먼저 온다.
                return o1.length < o2.length ? -1 : 1;
            }
        });

        StringBuilder sb = new StringBuilder();
        for(char[] chars : list){
            for(char ch : chars){
                sb.append(ch);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    // 2023-06-21
}
