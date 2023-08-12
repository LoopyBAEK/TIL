package boj.대회.가지컵2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A번_가지교배 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 가지의 품종 수
        int n = Integer.parseInt(br.readLine());
        // 가지
        String[] eggplant = br.readLine().split(" ");

        StringTokenizer st = new StringTokenizer(br.readLine());
        // 조수의 수
        int m = Integer.parseInt(st.nextToken());
        // 조수의 품종 수
        int k = Integer.parseInt(st.nextToken());
        // 조수가 만들어낸 가지
        char[] assistant = new char[m];

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            boolean bool = true;
            for(int j = 0; j < k; j++){
                int num = Integer.parseInt(st.nextToken());
                if(eggplant[num - 1].equals("P")){
                    bool = false;
                    break;
                }
            }
            if(!bool){
                assistant[i] = 'P';
            }else{
                assistant[i] = 'W';
            }
        }

        boolean isPossible = false;
        for(int i = 0; i < assistant.length; i++){
            if(assistant[i] == 'W'){
                isPossible = true;
                break;
            }
        }

        if(isPossible){
            System.out.println("W");
        }else{
            System.out.println("P");
        }
    }
    // 2023-04-08
}
