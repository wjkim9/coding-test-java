package com.test.coding.divideconquer;

import java.io.*;

public class CT11444 {

    final static long MOD = 1000000007;
    public static long[][] origin = {{1, 1}, {1, 0}}; // 초기 행렬 A

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());

        if (n <= 1) {
            System.out.println(n);
            return;
        }

        long[][] A_n_minus_1 = power(origin, n - 1);

        System.out.println(A_n_minus_1[0][0]);
    }

    public static long[][] power(long[][] A, long exp) {

        if (exp <= 1) {
            return A;
        }

        long[][] half = power(A, exp / 2);

        long[][] result = multiply(half, half);

        if (exp % 2 == 1L) {
            result = multiply(result, origin);
        }

        return result;
    }

    public static long[][] multiply(long[][] m1, long[][] m2) {
        long[][] result = new long[2][2];

        result[0][0] = ((m1[0][0] * m2[0][0]) + (m1[0][1] * m2[1][0])) % MOD;
        result[0][1] = ((m1[0][0] * m2[0][1]) + (m1[0][1] * m2[1][1])) % MOD;
        result[1][0] = ((m1[1][0] * m2[0][0]) + (m1[1][1] * m2[1][0])) % MOD;
        result[1][1] = ((m1[1][0] * m2[0][1]) + (m1[1][1] * m2[1][1])) % MOD;

        return result;
    }
}