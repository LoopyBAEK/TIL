package boj.대회.SolvedacGrandArena.Arena1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class A번_양말짝맞추기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            int curr = Integer.parseInt(br.readLine());
            if(!list.isEmpty()){
                if(list.contains(curr)){
                    int idx = list.indexOf(curr);
                    list.remove(idx);
                }else{
                    list.add(curr);
                }
            }else{
                list.add(curr);
            }
        }

        System.out.println(list.get(0));
    }
}
