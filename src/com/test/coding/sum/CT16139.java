package com.test.coding.sum;

import java.io.*;
import java.util.*;

public class CT16139 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = s.length();

        // ps[i][c] : 앞에서 i개(0..i-1)까지 봤을 때 문자 c('a'->0 ... 'z'->25)의 개수
        int[][] ps = new int[n + 1][26];

        for (int i = 1; i <= n; i++) {
            // 직전 행 복사 (26개 고정 길이: 매우 빠름)
            System.arraycopy(ps[i - 1], 0, ps[i], 0, 26);
            int c = s.charAt(i - 1) - 'a';
            ps[i][c]++;
        }

        int q = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder(q * 3);

        for (int i = 0; i < q; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int c = st.nextToken().charAt(0) - 'a';
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());

            int ans = ps[r + 1][c] - ps[l][c];
            sb.append(ans).append('\n');
        }

        System.out.print(sb.toString());
    }
}
