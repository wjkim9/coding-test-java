package com.test.coding.backtracking;

import java.io.*;
import java.util.StringTokenizer;

public class CT15651 {

    static int n, m;
    static int[] pick;
    static StringBuilder sb = new StringBuilder(1 << 20); // ~1MB

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        pick = new int[m];
        dfs(0); // 시작

        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }

    // 중복 허용 + 순서 O: 매 깊이마다 1..N 전부 시도
    static void dfs(int depth) {
        if (depth == m) {
            for (int i = 0; i < m - 1; i++) {
                sb.append(pick[i]).append(' ');
            }
            sb.append(pick[m - 1]).append('\n');
            return;
        }
        for (int num = 1; num <= n; num++) {
            pick[depth] = num;
            dfs(depth + 1);
        }
    }
}
