package boj.silver.silverII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 싸이버개강총회_19583 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 시작한 시간 s
        String s = st.nextToken();

        // 개강총회 끝낸 시간
        String e = st.nextToken();

        // 개강총회 스트리밍 끝낸 시간
        String q = st.nextToken();

        // 채팅기록을 담을 Map
        Map<String, String> chatHistory = new HashMap<>();
        Map<String,String> outChat = new HashMap<>();
        String str = br.readLine();
        while(str != null && str.length() > 0){
            st = new StringTokenizer(str);
            String time = st.nextToken();
            String nickname = st.nextToken();

            // 스트리밍 종료 후 채팅은 받지 않기
            if(time.compareTo(q) > 0){
                break;
            }

            // 개강총회 시작할 때 채팅 저장
            if(time.compareTo(s) <= 0){
                chatHistory.put(nickname, time);
            }

            // 개강총회 끝나기 전에 여러 번 채팅 치는 건 저장하지 않기 위해
            if(time.compareTo(e) >= 0 && time.compareTo(q) <= 0){
                outChat.put(nickname, time);
            }

            str = "";
            str = br.readLine();
        }
//        System.out.println(chatHistory);
//        System.out.println(outChat);

        // 출석 확인된 인원
        int check = 0;
        for(String nickname : chatHistory.keySet()){
            if(outChat.containsKey(nickname)){
//                System.out.println("누구 지우냐면 " + nickname);
                check++;
                outChat.remove(nickname);
            }
        }

        System.out.println(check);
    }
}
