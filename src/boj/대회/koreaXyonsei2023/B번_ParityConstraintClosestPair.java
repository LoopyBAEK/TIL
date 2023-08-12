package boj.대회.koreaXyonsei2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B번_ParityConstraintClosestPair {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 점의 개수
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numbers = new int[n];
        for(int i = 0; i < n; i++){
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(numbers);

        int odd = 0;
        int even = 0;

        int idx0 = numbers[0];
        int idx1 = numbers[1];
        if((idx1 - idx0) % 2 == 0){
            even = idx1 - idx0;
        }else{
            odd = idx1 - idx0;
        }

        for(int i = 2; i < numbers.length; i++){
            if((numbers[i] - numbers[i - 1]) % 2 == 1){
                if(odd == 0 || numbers[i] - numbers[i - 1] < odd){
                    odd = numbers[i] - numbers[i - 1];
                }
            }else if((numbers[i] - numbers[i - 2]) % 2 == 1){
                if(odd == 0 || numbers[i] - numbers[i - 2] < odd){
                    odd = numbers[i] - numbers[i - 2];
                }
            }

            if((numbers[i] - numbers[i - 1]) % 2 == 0){
                if(even == 0 || numbers[i] - numbers[i - 1] < even){
                    even = numbers[i] - numbers[i - 1];
                }
            }else if((numbers[i] - numbers[i - 2]) % 2 == 0){
                if(even == 0 || numbers[i] - numbers[i - 2] < even){
                    even = numbers[i] - numbers[i - 2];
                }
            }
        }


        if(odd == 0){
            odd = -1;
        }else if(even == 0){
            even = -1;
        }
        System.out.printf("%d %d", even, odd);

    }
    // 2023-04-02
}
