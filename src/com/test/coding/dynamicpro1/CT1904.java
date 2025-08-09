package com.test.coding.dynamicpro1;

import java.io.*;
import java.util.*;

public class CT1904 {
	
	 static List<List<int[]>> result = new ArrayList<>();
	
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
//        long[] dp = new long[n + 1];
//
//        dp[0] = 1;
//        dp[1] = 1;
//
//        for (int i = 2; i <= n; i++) {
//            dp[i] = dp[i - 1] + dp[i - 2];
//        }
        
        List<int[]> current = new ArrayList<>();
        backtrack(current, 0, n);
        
        bw.write(result.size() + "");
        
        bw.flush();
        bw.close();
        br.close();
    }
    
    static void backtrack(List<int[]> current, int currentLength, int targetLength) {
        if (currentLength == targetLength) {
            result.add(new ArrayList<>(current));
            return;
        }
        if (currentLength > targetLength) return;

        current.add(new int[]{1});
        backtrack(current, currentLength + 1, targetLength);
        current.remove(current.size() - 1);

        current.add(new int[]{0, 0});
        backtrack(current, currentLength + 2, targetLength);
        current.remove(current.size() - 1);
    }

}
