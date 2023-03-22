package boj.bronze.bronzeV;

import java.io.*;
import java.util.StringTokenizer;

public class A더하기B7_11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write("Case #" + (i + 1) + ": " + (a + b) + "\n");
        }
        bw.flush();
        bw.close();
    }
    // 2023-03-21
}
