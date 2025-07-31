package com.test.coding.advance2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class CT20920 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        Map<String, Integer> map = new HashMap<>();
        
        for (int i=0; i<n; i++) {
        	String input = br.readLine();
        	
        	if (input.length() < m) continue;
        	
        	map.put(input, map.containsKey(input) ? map.get(input) + 1 : 1);
        }
        
        List<String> result = map.entrySet().stream()
                .sorted((e1, e2) -> {
                    if (!e1.getValue().equals(e2.getValue())) {
                        return e2.getValue() - e1.getValue(); // 1. 빈도 내림차순
                    }
                    if (e1.getKey().length() != e2.getKey().length()) {
                        return e2.getKey().length() - e1.getKey().length(); // 2. 길이 내림차순
                    }
                    return e1.getKey().compareTo(e2.getKey()); // 3. 사전 오름차순
                })
                .map(Map.Entry::getKey) // 단어만 추출
                .collect(Collectors.toList()); // Java 11에서는 toList()

            for (String word : result) {
                bw.write(word + "\n");
            }
        
        bw.flush();
        br.close();
        bw.close();
    }
}
