package boj.silver.silverIV;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 요세푸스문제_1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        // list에 1번째부터 n번째까지 할당 할당
        for(int i = 0; i < n; i++){
            queue.offer(i + 1);
        }

        // 지워진 숫자 개수
        int count = 1;
        int[] delArray = new int[n];
        int del = 0;
        int arrayCount = 0;
        while(!queue.isEmpty()){
            if(count != k){
                queue.offer(queue.poll());
                count++;
            }else{
                delArray[arrayCount] = queue.poll();
                count = 1;
                arrayCount++;
            }
        }

        System.out.print("<");
        for(int i = 0; i < delArray.length; i++){
            if(i != delArray.length - 1){
                System.out.print(delArray[i] + ", ");
            }else{
                System.out.print(delArray[i] + ">");
            }
        }
    }
    // 2023-03-18
}
