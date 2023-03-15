package boj.bronze.bronzeIII;

import java.util.Arrays;
import java.util.Scanner;

public class 최소최대_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 주어지는 정수의 개수
        int n = sc.nextInt();
        int min = 0;
        int max = 0;
        // 정수를 담을 배열
        Integer[] numbers = new Integer[n];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
            if(min == 0){
                min = numbers[i];
                max = numbers[i];
            }else if(numbers[i] < min){
                min = numbers[i];
            }else if(numbers[i] > max){
                max = numbers[i];
            }
        }

        // Arrays.sort() < 최악의 경우 N제곱이 됨, 시간 많이 걸림!
        // 정수를 담은 배열을 오름차순 정렬하여 최솟값, 최댓값 찾기
//        Arrays.sort(numbers);
        System.out.printf("%d %d", min, max);
    }
    // 2023-03-14
}
