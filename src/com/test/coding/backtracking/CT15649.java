package com.test.coding.backtracking;

import java.io.*;
import java.util.StringTokenizer;

public class CT15649 {

    static int n, m;
    static int[] pick;
    static StringBuilder sb = new StringBuilder(1 << 20); // 대략 1MB 버퍼

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        pick = new int[m];
        dfs(0, 0); // depth=0, used=0(아무것도 안 쓴 상태)

        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }

    // used: 1<<(num-1) 비트가 켜져 있으면 해당 숫자 사용됨
    static void dfs(int depth, int used) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                sb.append(pick[i]);
                if (i + 1 < m) sb.append(' ');
            }
            sb.append('\n');
            return;
        }
        for (int num = 1; num <= n; num++) {
            int bit = 1 << (num - 1);
            if ((used & bit) != 0) continue;  // 이미 사용한 수
            pick[depth] = num;
            dfs(depth + 1, used | bit);
        }
    }
}
