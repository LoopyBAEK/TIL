package boj.silver.silverIII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;
import java.util.StringTokenizer;

public class 먹을것인가먹힐것인가_7795 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 테스트 케이스 수
        int t = Integer.parseInt(br.readLine());
        // 테스트 케이스 수만큼 for문 돌기
        for(int i = 0; i < t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            // A의 갯수
            int n = Integer.parseInt(st.nextToken());
            // B의 갯수
            int m = Integer.parseInt(st.nextToken());

            // A의 숫자들 담기
            int[] a = new int[n];
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++){
                a[j] = Integer.parseInt(st.nextToken());
            }
            // 오름차순 정렬 후
            Arrays.sort(a);

            // Stack에 담기
            Stack<Integer> aStack = new Stack<>();
            for(int num : a){
                aStack.push(num);
            }

            // B의 숫자들 담기
            int[] b = new int[m];
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++){
                b[j] = Integer.parseInt(st.nextToken());
            }
            // 오름차순 정렬 후
            Arrays.sort(b);

            // Stack에 담기
            Stack<Integer> bStack = new Stack<>();
            for(int num : b){
                bStack.push(num);
            }

            // A와 B 비교
            int count = 0;
            while(!aStack.isEmpty() && !bStack.isEmpty()){
                // aStack의 가장 큰 수
                int aNum = aStack.peek();

                // bStack의 가장 큰 수
                int bNum = bStack.peek();

                // aStack의 가장 큰 수가 bStack의 가장 큰 수보다 크면 bStack의 사이즈만큼 먹을 수 있다.
                if(aNum > bNum){
                    count += bStack.size();
                    aStack.pop();
                }else{
                    bNum = bStack.pop();
                }
            }

            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}
