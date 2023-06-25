package boj.bronze.bronzeIII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 곱셈_2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());
        String num2 = br.readLine();
        char[] num2Arr = num2.toCharArray();

        System.out.println(num1 * Integer.parseInt(String.valueOf(num2Arr[2])));
        System.out.println(num1 * Integer.parseInt(String.valueOf(num2Arr[1])));
        System.out.println(num1 * Integer.parseInt(String.valueOf(num2Arr[0])));
        System.out.println(num1 * Integer.parseInt(num2));
    }
}
