package boj.bronze.bronzeIII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 균형잡힌소떡소떡_25641 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 소떡소떡의 길이
        int n = Integer.parseInt(br.readLine());
        // 소떡소떡 담기
        ArrayList<Character> stst = new ArrayList<>();
        String str = br.readLine();
        for(int i = 0; i < n; i++){
            stst.add(str.charAt(i));
        }
//        System.out.println(stst);

        while(true){
            // 소세지와 떡 갯수를 세기 위한 변수
            int s = 0;
            int t = 0;
            for(int i = 0; i < stst.size(); i++){
                if(stst.get(i) == 's'){
                    s++;
                }else{
                    t++;
                }
            }

            // 소세지와 떡이 하나도 없을 때
            if(s == 0 && t == 0){
                break;
                // 소세지 개수와 떡의 개수가 같을 때
            }else if(s == t){
                break;
                // 소세지 개수와 떡의 개수가 같지 않으면 제일 왼쪽의 떡이나 소세지 제거
            }else{
                stst.remove(0);
            }
        }
//        System.out.println(stst);

        // 길이가 최대인 균형잡힌 소떡소떡 출력
        for(int i = 0; i < stst.size(); i++){
            System.out.print(stst.get(i));
        }
    }
    // 2023-04-01
}
