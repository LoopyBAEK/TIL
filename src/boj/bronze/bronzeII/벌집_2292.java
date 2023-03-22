package boj.bronze.bronzeII;

import java.io.*;

public class 벌집_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // n번째 방
        int n = Integer.parseInt(br.readLine());
        // 방 번호
        int room = 1;
        int multiple = 6;
        int lastRoom = 2;
        int loop = 1;

        while(true){
            if(n == 1){
                bw.write(1 + "");
                break;
            }else if(n >= room && n < lastRoom){
                bw.write(loop + "");
                break;
            }
            room = lastRoom;
            lastRoom = room + multiple;
            multiple += 6;
            loop++;
        }
        bw.flush();
        bw.close();
    }
    // 2023-03-21
}
