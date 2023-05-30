package boj.bronze.bronzeI;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

public class 팰린드롬수_1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "";
        while(!(str = br.readLine()).equals("0")){
//            System.out.println(str);

            // 문자열로 받은 정수를 문자로 덱에 담기
            Deque<Character> chars = new LinkedList<>();
            for(int i = 0; i < str.length(); i++){
                chars.offer(str.charAt(i));
            }
//            System.out.println(chars);

            // 앞뒤로 한 글자씩 삭제하면서 팰린드롬수인지 확인하기
            boolean palindrome = true;
            for(int i = 0; i < chars.size(); i++){
                if(chars.size() == 1){
                    break;
                }
                if(chars.pollFirst() != chars.pollLast()){
                    palindrome = false;
                    break;
                }
//                System.out.println(chars);
            }

            System.out.println(palindrome ? "yes" : "no");
        }
    }

    //2023-05-30
}
