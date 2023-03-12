package boj.bronze.bronzeV;

import java.util.Scanner;

public class 행렬덧셈_2738 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arrA = new int[n][m];
		int[][] arrB = new int[n][m];
		
		// 행렬A 값 넣기
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				arrA[i][j] = sc.nextInt();
			}
		}
		
		// 행렬B 값 넣기
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				arrB[i][j] = sc.nextInt();
			}
		}

		// 행렬A + 행렬B
		for(int i = 0 ; i < n; i++){
			for(int j = 0; j < m; j++){
				System.out.print(arrA[i][j] + arrB[i][j] + " ");
			}
			System.out.println();	// 행 구분 위해 개행
		}

		// 2023-02-04
	}
}
