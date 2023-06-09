package boj.bronze.bronzeV;

import java.util.*;
import java.math.BigInteger;

public class 큰수AplusB_10757{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        BigInteger a = new BigInteger(sc.next());
        BigInteger b = new BigInteger(sc.next());
        
        System.out.println(a.add(b).toString());
    }
}
