package boj.bronzeV;

import java.util.Scanner;

public class verification_2475 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int num5 = sc.nextInt();
		int v = (num1 * num1 + num2 * num2 + num3 * num3 + num4 * num4 + num5 * num5)%10;
		System.out.println(v);
	}
}
