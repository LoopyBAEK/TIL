package boj.bronze.bronzeIV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 상근날드_5543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] menu = new int[5];
        for(int i = 0; i < 5; i++){
            menu[i] = Integer.parseInt(br.readLine());
        }

        // 세트가격
        int[] set = new int[3];
        // 콜라가 사이다보다 싸면
        for(int i = 0; i < 3; i++){
            if(menu[3] < menu[4]){
                set[i] = menu[i] + menu[3] - 50;
            }else {
                set[i] = menu[i] + menu[4] - 50;
            }
        }

        // 가장 싼 값 출력
        Arrays.sort(set);
        System.out.println(set[0]);
    }
}
