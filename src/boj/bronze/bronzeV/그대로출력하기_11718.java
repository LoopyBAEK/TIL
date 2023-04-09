package boj.bronze.bronzeV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 그대로출력하기_11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        while ((str = br.readLine()) != null){
            System.out.println(str);
        }

        //reader는 말 그대로 읽기만 하는 역할이기 때문에, 모든 출력이 끝난 뒤 어떤 문자를(이 문자는 EOF겠죠) 읽는다고 해도 전체 출력에는 영향을 주지 않음.
        // 그리고 채점 프로그램은 출력이 끝난 후에 무슨 짓을 하든 출력만 맞으면 정답 판정.
        // 이후에 EOF가 읽히면 str이 null이기 때문에 반복문을 탈출할 수 있음.
    }
}
