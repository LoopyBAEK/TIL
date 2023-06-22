package boj.silver.silverIII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class 빈도정렬_2910 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 메시지의 길이
        int n = Integer.parseInt(st.nextToken());

        // 최대 숫자
        int c = Integer.parseInt(st.nextToken());

        // 메시지 정보를 담을 map, 순서 보장을 위해 LinkedHashMap 사용
        Map<Integer, Integer> map = new LinkedHashMap<>(n);
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            int curr = Integer.parseInt(st.nextToken());

            // 들어온 적 없는 수면
            if(!map.containsKey(curr)){
                map.put(curr, 1);
            }else{
                // 들어온 적 있는 수면
                map.put(curr, map.get(curr) + 1);
            }
        }
//        System.out.println("map = " + map);

        // map value 정보를 담을 리스트
        List<Map.Entry<Integer, Integer>> list = map.entrySet().stream().collect(Collectors.toList());
//        System.out.println("list = " + list);

        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                // 2. 등장하는 횟수가 같다면 먼저 나온 수가 앞에 오도록
                if(o1.getValue().equals(o2.getValue())) {
                    for(Integer key : map.keySet()){
                        if(o1.getKey().equals(key)) {
                            return -1;
                        }else if(o2.getKey().equals(key)){
                            return 1;
                        }
                    }
                }

                // 1. 더 많이 나온 수가 앞에 오도록
                return o1.getValue() > o2.getValue() ? -1 : 1;
            }
        });
//        System.out.println("정렬 후 list = " + list);

        // 출력
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Integer, Integer> result : list){
            int key = result.getKey();
            for(int i = 0; i < result.getValue(); i++){
                sb.append(key).append(" ");
            }
        }
        System.out.println(sb);
    }

    // 2023-06-22
    // 출력이 이상하게 나온다면 출력 부분을 다시 한 번 확인하자...
    // 정렬 부분 문제인 줄 알았다...
}
