package boj.silver.silverV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class 피보나치수4_10826 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        BigInteger[] arr = new BigInteger[n + 1];
        arr[0] = new BigInteger("0");
        if(n != 0){
            arr[1] = new BigInteger("1");
            for(int i = 2; i <= n; i++){
                BigInteger bigInteger1 = arr[i - 1];
                BigInteger bigInteger2 = arr[i - 2];
                arr[i] = bigInteger1.add(bigInteger2);
            }
        }

        System.out.println(arr[n]);
    }

    // 2023-07-19
}
