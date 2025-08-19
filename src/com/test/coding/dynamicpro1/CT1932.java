package com.test.coding.dynamicpro1;

import java.io.*;
import java.util.*;

public class CT1932 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            String line = br.readLine();
            if (line == null) return null;
            st = new StringTokenizer(line);
        }
        return st.nextToken();
    }

    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(next());
        int[][] tri = new int[n][];
        for (int i = 0; i < n; i++) {
            tri[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) tri[i][j] = Integer.parseInt(next());
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) tri[i][j] += tri[i-1][0];
                else if (j == i) tri[i][j] += tri[i-1][j-1];
                else tri[i][j] += Math.max(tri[i-1][j-1], tri[i-1][j]);
            }
        }

        int ans = 0;
        for (int v : tri[n-1]) ans = Math.max(ans, v);
        System.out.println(ans);
    }
}
