package swea;

import java.io.*;
import java.util.StringTokenizer;

public class Flatten_1208 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 덤프 횟수
        int dump = 0;

        // 덤프 제한 수만큼 덤프하기 / 최고점, 최저점 찾기
        int max = 0;
        int maxIndex = 0;
        int min = 0;
        int minIndex = 0;
        for(int i = 0; i < 10; i++){
            dump = Integer.parseInt(br.readLine());
            // 각 상자의 높이값 배열에 담기
            int[] hArray = new int[100];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < hArray.length; j++){
                hArray[j] = Integer.parseInt(st.nextToken());
            }

            for(int k = 0; k < dump; k++){
                max = 0;
                min = 0;
                maxIndex = 0;
                minIndex = 0;
                // 최고점, 최저점 찾기 위한 for문
                for(int l = 0; l < hArray.length; l++){
                    // 최고점, 최저점
                    if(hArray[l] > max){
                        max = hArray[l];
                        maxIndex = l;
                    }
                    if(min == 0){
                        min = hArray[l];
                        minIndex = l;
                    }else if(hArray[l] < min){
                        min = hArray[l];
                        minIndex = l;
                    }
                }
                hArray[maxIndex]--;
                hArray[minIndex]++;
            }

            max = 0;
            min = 0;
            // 덤프를 다 한 후 최고점, 최저점 찾기
            for(int m = 0; m < hArray.length; m++){
                // 최고점, 최저점
                if(hArray[m] > max){
                    max = hArray[m];
                }
                if(min == 0){
                    min = hArray[m];
                }else if(hArray[m] < min){
                    min = hArray[m];
                }
            }
            bw.write("#" + (i + 1) + " " + (max - min) + "\n");
        }
        bw.flush();
        bw.close();
    }
    // 2023-03-20
}
