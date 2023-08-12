package boj.대회.DPC2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B번_안밖밖안계단역계단 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 문자열 s
        String s = br.readLine();

        if(s.equals("fdsajkl;") || s.equals("jkl;fdsa")){
            System.out.println("in-out");
        }else if(s.equals("asdf;lkj") || s.equals(";lkjasdf")){
            System.out.println("out-in");
        }else if(s.equals("asdfjkl;")){
            System.out.println("stairs");
        }else if(s.equals(";lkjfdsa")){
            System.out.println("reverse");
        }else{
            System.out.println("molu");
        }
    }
}
