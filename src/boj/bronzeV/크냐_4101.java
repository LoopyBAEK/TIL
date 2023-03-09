package boj.bronzeV;

import java.util.Scanner;

public class 크냐_4101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            if(num1 != 0 && num2 != 0){
                String result = num1 > num2 ? "Yes" : "No";
                System.out.println(result);
            }else{
                break;
            }
        }
        // 2023-02-04
    }
}
