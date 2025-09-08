package com.test.coding.dynamicpro1;

import java.io.*;
import java.util.*;

public class CT11054 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

        int[] lis = new int[n];
        int[] lds = new int[n];

        // LIS: i에서 끝나는 증가 부분수열
        Arrays.fill(lis, 1);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    lis[i] = Math.max(lis[i], lis[j] + 1);
                }
            }
        }

        // LDS: i에서 시작하는 감소 부분수열
        Arrays.fill(lds, 1);
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j > i; j--) {
                if (arr[j] < arr[i]) {
                    lds[i] = Math.max(lds[i], lds[j] + 1);
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, lis[i] + lds[i] - 1); // i가 중복이므로 -1
        }
        System.out.println(ans);
    }

}