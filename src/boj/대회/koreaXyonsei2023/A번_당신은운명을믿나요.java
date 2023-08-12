package boj.대회.koreaXyonsei2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class A번_당신은운명을믿나요 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            list.add(s.charAt(i));
        }

        String korea = "KOREA";
        int koreaCount = 0;
        String yonsei = "YONSEI";
        int yonseiCount = 0;
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) == korea.charAt(koreaCount) && list.get(i) == yonsei.charAt(yonseiCount)){
                koreaCount++;
                yonseiCount++;
            }else if(list.get(i) == korea.charAt(koreaCount)){
                koreaCount++;
                if(koreaCount == 5){
                    break;
                }
            }else if(list.get(i) == yonsei.charAt(yonseiCount)){
                yonseiCount++;
                if(yonseiCount == 6){
                    break;
                }
            }
        }

        if(koreaCount == 5){
            System.out.println("KOREA");
        }else if(yonseiCount == 6){
            System.out.println("YONSEI");
        }
    }
    // 2023-04-02
}
