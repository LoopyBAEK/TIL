package boj.bronze.bronzeII;

import java.io.*;

public class 알파벳찾기_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 문자열 s
        String s = br.readLine();
        // 알파벳 찾은 결과 넣을 배열
        int[] alp = new int[26];

        // 알파벳 위치 찾기
        for(int i = 0; i < s.length(); i++){
            if(alp[s.charAt(i) - 'a'] == 0){
                alp[s.charAt(i) - 'a'] = i + 1;
            }
        }

        // 결과 출력
        for(int i = 0; i < 26; i++){
            if(alp[i] != 0){
                bw.write(alp[i] - 1 + " ");
            }else{
                bw.write(-1 + " ");
            }
        }
        bw.flush();
        bw.close();
    }
    // 2023-03-19
}
