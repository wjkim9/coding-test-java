package com.test.coding.backtracking;

import java.io.*;
import java.util.StringTokenizer;

public class CT15650 {

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
        dfs(0, 1); // depth=0, 다음 선택은 1부터

        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }

    // 조합: 항상 오름차순 유지 (start부터 고름)
    static void dfs(int depth, int start) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                sb.append(pick[i]);
                if (i + 1 < m) sb.append(' ');
            }
            sb.append('\n');
            return;
        }

        // 가지치기: 남은 칸을 모두 채울 수 있는 최대 시작값까지만 순회
        // 남은 칸 수 = m - depth
        for (int num = start; num <= n - (m - depth) + 1; num++) {
            pick[depth] = num;
            dfs(depth + 1, num + 1);
        }
    }
}
