package com.test.coding.greedy;

import java.io.*;
import java.util.*;

public class CT1931 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] a = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            a[i][0] = Integer.parseInt(st.nextToken()); // start
            a[i][1] = Integer.parseInt(st.nextToken()); // end
        }

        Arrays.sort(a, (x, y) -> x[1] == y[1] ? x[0] - y[0] : x[1] - y[1]);

        int cnt = 0;
        int lastEnd = Integer.MIN_VALUE; // 또는 0 (문제 범위에 맞춰)
        for (int[] it : a) {
            if (it[0] >= lastEnd) {
                cnt++;
                lastEnd = it[1];
            }
        }
        System.out.println(cnt);
    }
}
