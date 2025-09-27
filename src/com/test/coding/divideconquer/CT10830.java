package com.test.coding.divideconquer;

import java.io.*;
import java.util.*;

public class CT10830 {

    static int N;
    static int[][] origin;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        origin = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {

                origin[i][j] = Integer.parseInt(st.nextToken()) % 1000;
            }
        }

        int[][] result = power(origin, B);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(result[i][j]).append(' ');
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }

    public static int[][] power(int[][] A, long exp) {

        if (exp == 1L) {
            return A;
        }

        int[][] half = power(A, exp / 2);

        int[][] result = multiply(half, half);

        if (exp % 2 == 1L) {
            result = multiply(result, origin);
        }

        return result;
    }

    public static int[][] multiply(int[][] m1, int[][] m2) {
        int[][] result = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    result[i][j] += m1[i][k] * m2[k][j];
                    result[i][j] %= 1000; // 곱셈 중간마다 모듈러 연산
                }
            }
        }
        return result;
    }
}