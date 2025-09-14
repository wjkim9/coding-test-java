package com.test.coding.sum;

import java.io.*;
import java.util.*;

public class CT11660 {
    static final class FastScanner {
        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;
        FastScanner(InputStream is) { in = is; }
        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }
        int nextInt() throws IOException {
            int c, s = 1, x = 0;
            do c = read(); while (c <= ' ');      // skip spaces
            if (c == '-') { s = -1; c = read(); }
            while (c > ' ') { x = x * 10 + (c - '0'); c = read(); }
            return x * s;
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        int N = fs.nextInt();
        int M = fs.nextInt();

        long[][] ps = new long[N + 1][N + 1];

        for (int i = 1; i <= N; i++) {
            long rowSum = 0; // (선택) 한 행에서 누적해서 써도 됨
            for (int j = 1; j <= N; j++) {
                int a = fs.nextInt();
                // 표준 2D prefix (행/열 모두 포함)
                ps[i][j] = ps[i-1][j] + ps[i][j-1] - ps[i-1][j-1] + a;
            }
        }

        StringBuilder sb = new StringBuilder(M * 3);
        for (int q = 0; q < M; q++) {
            int x1 = fs.nextInt(), y1 = fs.nextInt();
            int x2 = fs.nextInt(), y2 = fs.nextInt();
            long ans = ps[x2][y2] - ps[x1-1][y2] - ps[x2][y1-1] + ps[x1-1][y1-1];
            sb.append(ans).append('\n');
        }
        System.out.print(sb);
    }
}

