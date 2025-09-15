package com.test.coding.sum;

import java.io.*;
import java.util.*;

public class CT25682 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][] ps = new int[N + 1][M + 1]; // W-시작 기준 불일치 누적합

        for (int i = 1; i <= N; i++) {
            String row = br.readLine();
            for (int j = 1; j <= M; j++) {
                char ch = row.charAt(j - 1);
                // 기대 색 (W-시작): (i+j) 짝수=W, 홀수=B
                boolean expectW = ((i + j) & 1) == 0;
                int mismatch = (expectW ? (ch == 'W' ? 0 : 1) : (ch == 'B' ? 0 : 1));

                ps[i][j] = ps[i - 1][j] + ps[i][j - 1] - ps[i - 1][j - 1] + mismatch;
            }
        }

        int area = K * K;
        int ans = Integer.MAX_VALUE;

        for (int i = K; i <= N; i++) {
            for (int j = K; j <= M; j++) {
                int w = ps[i][j] - ps[i - K][j] - ps[i][j - K] + ps[i - K][j - K];
                int repaint = Math.min(w, area - w); // W-시작 vs B-시작
                if (repaint < ans) ans = repaint;
            }
        }

        System.out.println(ans);
    }
}
