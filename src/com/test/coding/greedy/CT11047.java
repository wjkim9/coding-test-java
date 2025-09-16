package com.test.coding.greedy;

import java.io.*;
import java.util.StringTokenizer;

public class CT11047 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] A = new int[N];
        for (int i = 0; i < N; i++) A[i] = Integer.parseInt(br.readLine());

        int cnt = 0;
        for (int i = N - 1; i >= 0 && K > 0; i--) {
            if (A[i] <= K) {
                cnt += K / A[i];
                K %= A[i];
            }
        }
        System.out.println(cnt);
    }
}

