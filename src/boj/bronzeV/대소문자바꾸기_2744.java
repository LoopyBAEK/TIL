package boj.bronzeV;

import java.util.Scanner;

public class 대소문자바꾸기_2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String strReplace = "";
        for(int i = 0; i < str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                strReplace += Character.toLowerCase(str.charAt(i));
            }else {
                strReplace += Character.toUpperCase(str.charAt(i));
            }
        }

        System.out.print(strReplace);

        // 2023-02-04
    }
}
