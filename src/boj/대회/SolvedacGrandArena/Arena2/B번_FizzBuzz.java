package boj.대회.SolvedacGrandArena.Arena2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class B번_FizzBuzz {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strs = new String[]{br.readLine(), br.readLine(), br.readLine()};
        int[] strToInt = new int[3];

        for(int i = 0; i < 3; i++){
            if(!strs[i].equals("Fizz") && !strs[i].equals("Buzz") && !strs[i].equals("FizzBuzz")){
                strToInt[i] = Integer.parseInt(strs[i]);
            }
        }

        int result = 0;
        for(int i = 2; i >= 0; i--){
            if(strToInt[i] != 0){
                result = strToInt[i];
                if(i == 2){
                    result += 1;
                }else if(i == 1){
                    result += 2;
                }else if(i == 0){
                    result += 3;
                }
            }
        }
        if(result % 3 == 0 && result % 5 == 0){
            System.out.println("FizzBuzz");
        }else if(result % 3 == 0 && result % 5 != 0){
            System.out.println("Fizz");
        }else if(result % 3 != 0 && result % 5 == 0){
            System.out.println("Buzz");
        }else{
            System.out.println(result);
        }
    }
}
