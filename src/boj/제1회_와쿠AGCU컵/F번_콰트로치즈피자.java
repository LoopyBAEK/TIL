package boj.제1회_와쿠AGCU컵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class F번_콰트로치즈피자 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < num; i++){
            String str = st.nextToken();
            int len = str.length();
            if(len < 6) continue;
            if(str.substring(len-6, len).equals("Cheese")){
                set.add(str);
            }
        }

        if(set.size() >= 4){
            System.out.println("yummy");
        }else{
            System.out.println("sad");
        }
    }
}
