package com.test.coding.sum;

import java.io.*;
import java.util.*;

public class CT10986 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[] cnt = new long[M];
        st = new StringTokenizer(br.readLine());

        long prefix = 0;
        for (int i = 0; i < N; i++) {
            if (!st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            prefix = (prefix + a) % M;
            if (prefix < 0) prefix += M; // 음수 방어 (필요시)
            cnt[(int) prefix]++;
        }

        long ans = cnt[0]; // 시작이 1인 구간들
        for (int r = 0; r < M; r++) {
            long c = cnt[r];
            if (c >= 2) ans += c * (c - 1) / 2;
        }

        System.out.println(ans);
    }
}

