package boj.bronzeV;

import java.util.Scanner;

public class 별찍기1_2438 {

	public static void main(String[] args) {
		String star = "";
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for(int i = 0; i < count; i++) {
			star += "*";
			System.out.println(star);
		}
	}
}
