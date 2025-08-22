package com.test.coding.dynamicpro1;

import java.io.*;

public class CT2579 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] a = new int[N + 1];
        for (int i = 1; i <= N; i++) a[i] = Integer.parseInt(br.readLine());

        if (N == 1) { System.out.println(a[1]); return; }
        if (N == 2) { System.out.println(a[1] + a[2]); return; }

        int[] dp = new int[N + 1];
        dp[1] = a[1];
        dp[2] = a[1] + a[2];
        for (int i = 3; i <= N; i++) {
            dp[i] = Math.max(dp[i - 2], dp[i - 3] + a[i - 1]) + a[i];
        }
        System.out.println(dp[N]);
    }
}
