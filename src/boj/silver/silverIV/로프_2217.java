package boj.silver.silverIV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class 로프_2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 로프 길이 정보를 배열에 담기
        int[] len = new int[n];
        for(int i = 0; i < n; i++){
            len[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(len);

        // 각 로프가 버틸 수 있는 최대 중량
        int[] wei = new int[n];
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                wei[i] += len[i];
            }
        }
        Arrays.sort(wei);
//        System.out.println(Arrays.toString(wei));

        // 최대 중량 출력하기
        System.out.println(wei[n - 1]);
    }

    // 2023-07-11
    // 시간 제한 2초, 이렇게 돌리게 되면 10만 나누기 2만큼 돌게된다. 다음부턴 이중포문은 자제하는 걸로 하자...
    // 그런데 통과를 했다. 뭘까? 재채점하면 다시 풀어야 될듯
}
