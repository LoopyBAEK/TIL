package boj.bronze.bronzeV;

import java.math.BigInteger;
import java.util.Scanner;

public class 엄청난부자2_1271 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger money = new BigInteger(sc.next());
		BigInteger organism = new BigInteger(sc.next());
		
		BigInteger divisionMoney = money.divide(organism);
		System.out.println(divisionMoney);
		BigInteger remainder = money.remainder(organism);
		System.out.println(remainder);
		
		// 2023-01-17
	}
}
