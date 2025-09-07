package com.test.coding.dynamicpro1;

import java.io.*;
import java.util.*;

public class CT11053 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

        int[] dp = new int[n];
        Arrays.fill(dp, 1); // 최소 길이는 자기 자신 하나

        int ans = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) { // 증가 조건
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            ans = Math.max(ans, dp[i]);
        }

        System.out.println(ans);
    }

}