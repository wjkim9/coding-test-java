package com.test.coding.dynamicpro1;

import java.io.*;

public class CT1436 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        int[] dp = new int[N + 1];
        dp[1] = 0;
        for (int i = 2; i <= N; i++) {
            int best = dp[i - 1] + 1;
            if (i % 2 == 0) best = Math.min(best, dp[i / 2] + 1);
            if (i % 3 == 0) best = Math.min(best, dp[i / 3] + 1);
            dp[i] = best;
        }
        System.out.println(dp[N]);
    }
}
