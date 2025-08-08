package com.test.coding.dynamicpro1;

import java.io.*;
import java.util.StringTokenizer;

public class CT9184 {
	
    static int[][][] dp = new int[21][21][21];
	
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while (true) {
        	StringTokenizer st = new StringTokenizer(br.readLine());

        	int a = Integer.parseInt(st.nextToken());
        	int b = Integer.parseInt(st.nextToken());
        	int c = Integer.parseInt(st.nextToken());
        	
        	if (a == -1 && b == -1 && c == -1) break;
        	
        	int result = recurse(a, b, c);

        	bw.write(String.format("w(%d, %d, %d) = %d\n", a, b, c, result));
        }
        
        bw.flush();
        bw.close();
        br.close();
    }

    static int recurse(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) return 1;
        if (a > 20 || b > 20 || c > 20) return recurse(20, 20, 20);

        if (dp[a][b][c] != 0) return dp[a][b][c];

        if (a < b && b < c) {
            dp[a][b][c] = recurse(a, b, c - 1) + recurse(a, b - 1, c - 1) - recurse(a, b - 1, c);
        } else {
            dp[a][b][c] = recurse(a - 1, b, c)
                        + recurse(a - 1, b - 1, c)
                        + recurse(a - 1, b, c - 1)
                        - recurse(a - 1, b - 1, c - 1);
        }
        return dp[a][b][c];
    }
}
