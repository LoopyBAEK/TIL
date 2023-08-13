package boj.대회.제1회_하이콘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B번_알록달록_앵무새 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<String> set = new LinkedHashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        set.add(st.nextToken());
        set.add(st.nextToken());
        st = new StringTokenizer(br.readLine());
        set.add(st.nextToken());
        set.add(st.nextToken());

        ArrayList<String> colors = new ArrayList<>();
        for(String color : set){
            colors.add(color);
        }

        Collections.sort(colors);
        StringBuilder sb = new StringBuilder();
        for(String body : colors){
            for(String tail : colors){
                sb.append(body).append(" ").append(tail).append("\n");
            }
        }
        System.out.println(sb);
    }
}
