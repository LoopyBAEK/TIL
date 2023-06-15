package boj.silver.silverIII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 패션왕신해빈_9375 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        // 테스트 케이스 개수
        int test = sc.nextInt();

        for(int i = 0; i < test; i++){
            int n = sc.nextInt();
            Map<String, Integer> map = new HashMap<>();

            for(int j = 0; j < n; j++){
                String name = sc.next();
                String type = sc.next();
                // map에 key값이 존재한다면 해당 value를 반환하고, 없다면 defaultValue를 반환
                map.put(type, map.getOrDefault(type, 0) + 1);
            }
//            System.out.println(map);

            int ans = 1;
            for(int val : map.values()){
                ans *= val + 1;
            }
            System.out.println(ans - 1);
        }
    }

    // 2023-06-15
    // 상의를 입지 않거나 하나를 골라 입는 경우가 발생하게 된다. 때문에, 경우의 수를 셀 때 단순 개수의 곱이 아닌 입지 않는 경우를 고려하여 + 1을 한 결과를 곱셈해주어야 한다.
    // 따라서 (옷의 종류당 개수 + 1) 들의 곱셈으로 구할 수 있는데, 옷을 하나도 입지 않으면 안되기 때문에 옷을 하나도 입지 않는 경우를 - 1 처리하면 된다.
}
