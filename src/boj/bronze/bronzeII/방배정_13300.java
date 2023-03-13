package boj.bronze.bronzeII;

import java.util.Scanner;

public class 방배정_13300 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 수학여행 가는 인원 수
        int n = sc.nextInt();
        // 한 방에 배정할 수 있는 최대 인원 수
        int k = sc.nextInt();
        // 학생 정보 담을 이차원 배열 선언
        int[][] students = new int[n][2];
        // 학생 정보를 기반으로 한 학생 수 카운트 배열
        int[][] count = new int[6][2];
        // 필요한 방의 수
        int room = 0;

        // 학생 정보 담기
        for(int i = 0; i < students.length; i++){
            for(int j = 0; j < 2; j++){
                students[i][j] = sc.nextInt();
            }
        }

        // 학년, 성별을 따져 학생 수 세기
        int s = 0;
        for(int i = 0; i < students.length; i++){
            for(int j = 0; j < 2; j++){
                if(j == 0){
                  s = students[i][j];
                }else{
                    int y = students[i][j];
                    count[y - 1][s]++;
                }
            }
        }

        // 필요한 방 수 세기
        for(int i = 0; i < count.length; i++){
            for(int j = 0; j < 2; j++){
                if(count[i][j] % k == 0){
                    room += count[i][j] / k;
                }else{
                    room += count[i][j] / k + 1;
                }
            }
        }

        // 방 수 출력
        System.out.println(room);
    }
    // 2023-03-13
}
