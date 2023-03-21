package boj.bronze.bronzeII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 블랙잭_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 카드의 개수
        int n = Integer.parseInt(st.nextToken());
        // M
        int m = Integer.parseInt(st.nextToken());
        // 카드 배열
        int[] card = new int[n];
        st = new StringTokenizer(br.readLine());
        // m보다 작은 숫자만 배열에 넣기
        for(int i = 0; i < card.length; i++){
            int currCard = Integer.parseInt(st.nextToken());
            if(currCard < m){
                card[i] = currCard;
            }
        }

        int sum = 0;
        for(int i = 0; i < card.length - 2; i++){
            for(int j = i + 1; j < card.length - 1; j++){
                for(int k = j + 1; k < card.length; k++){
                    if(card[i] + card[j] + card[k] <= m){
                        if(card[i] + card[j] + card[k] > sum){
                            sum = card[i] + card[j] + card[k];
                        }
                    }
                }
            }
        }
        System.out.println(sum);
    }
    // 2023-03-20
}
