package boj.bronzeII;

import java.util.Arrays;
import java.util.Scanner;

public class numberOfWords_1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArray = str.split(" ");
//        System.out.println(Arrays.toString(strArray));

        int wordsCount = 0;

        for(int i = 0; i < strArray.length; i++){
            if(!strArray[i].equals("")){
                wordsCount++;
            }
        }

        System.out.println(wordsCount);
    }
}

// 2023-03-08