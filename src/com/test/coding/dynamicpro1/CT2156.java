package com.test.coding.dynamicpro1;

import java.io.*;

public class CT2156 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];

        for (int i=1; i<=n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        if (n==1) {
            System.out.println(arr[1]);
            return;
        }

        if (n==2) {
            System.out.println(arr[1] + arr[2]);
            return;
        }

        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = arr[1];
        dp[2] = arr[1] + arr[2];

        for (int i = 3; i <= n; i++) {
            int case1 = dp[i-1];
            int case2 = dp[i-2] + arr[i];
            int case3 = dp[i-3] + arr[i-1] + arr[i];
            dp[i] = Math.max(case1, Math.max(case2, case3));
        }

        System.out.println(dp[n]);
    }

}