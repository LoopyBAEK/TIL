package boj.silver.silverII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 잃어버린괄호_1541 {
    public static void main(String[] args) throws IOException {
        // 더할 거 먼저 다 더한 후 마이너스하면 됨

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("-");

        ArrayList<Integer> nums = new ArrayList<>();
        for(String curr : str){
            if(curr.contains("+")){
                String[] plus = curr.split("\\+");
                int sum = 0;
                for(String plusCurr : plus){
                    sum += Integer.parseInt(plusCurr);
                }
                nums.add(sum);
            }else{
                nums.add(Integer.parseInt(curr));
            }
        }
//        System.out.println(nums);

        // 정답 출력하기
        int result = nums.get(0);
        for(int i = 1; i < nums.size(); i++){
            result -= nums.get(i);
        }
        System.out.println(result);
    }

    // 2023-07-07
}
