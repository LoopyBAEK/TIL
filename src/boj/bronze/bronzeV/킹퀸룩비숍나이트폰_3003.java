package boj.bronze.bronzeV;

import java.util.Scanner;

public class 킹퀸룩비숍나이트폰_3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 검은색 피스
        int bKing = 1;
        int bQueen = 1;
        int bRock = 2;
        int bBishop = 2;
        int bKnight = 2;
        int bPawn = 8;

        // 흰색 피스
        int wKing = sc.nextInt();
        int wQueen = sc.nextInt();
        int wRock = sc.nextInt();
        int wBishop = sc.nextInt();
        int wKnight = sc.nextInt();
        int wPawn = sc.nextInt();

        System.out.print(bKing - wKing + " ");
        System.out.print(bQueen - wQueen + " ");
        System.out.print(bRock - wRock + " ");
        System.out.print(bBishop - wBishop + " ");
        System.out.print(bKnight - wKnight + " ");
        System.out.print(bPawn - wPawn);

        // 2023-02-04
    }
}
