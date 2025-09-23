package com.test.coding.divideconquer;

import java.io.*;
import java.util.*;

public class CT1780 {

    public static int[][] paper;
    public static int minusOneCount = 0;
    public static int zeroCount = 0;
    public static int plusOneCount = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        paper = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        solve(0, 0, N);

        System.out.println(minusOneCount);
        System.out.println(zeroCount);
        System.out.println(plusOneCount);
    }

    public static void solve(int row, int col, int size) {

        if (isSameNumber(row, col, size)) {
            int number = paper[row][col];
            if (number == -1) {
                minusOneCount++;
            } else if (number == 0) {
                zeroCount++;
            } else { // number == 1
                plusOneCount++;
            }
            return;
        }

        int newSize = size / 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                solve(row + i * newSize, col + j * newSize, newSize);
            }
        }
    }

    public static boolean isSameNumber(int row, int col, int size) {
        int number = paper[row][col];

        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (paper[i][j] != number) {
                    return false;
                }
            }
        }
        return true;
    }
}