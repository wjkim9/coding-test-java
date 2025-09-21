package com.test.coding.divideconquer;

import java.io.*;
import java.util.*;

public class CT2630 {

    public static int[][] paper;
    public static int whiteCount = 0;
    public static int blueCount = 0;

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

        System.out.println(whiteCount);
        System.out.println(blueCount);
    }

    public static void solve(int row, int col, int size) {

        if (isSameColor(row, col, size)) {
            if (paper[row][col] == 0) {
                whiteCount++;
            } else {
                blueCount++;
            }
            return;
        }

        // 색이 섞여 있으면 4분할하여 재귀 호출 (분할)
        int newSize = size / 2;

        solve(row, col, newSize);                           // 1사분면 (좌상)
        solve(row, col + newSize, newSize);                // 2사분면 (우상)
        solve(row + newSize, col, newSize);                // 3사분면 (좌하)
        solve(row + newSize, col + newSize, newSize);      // 4사분면 (우하)
    }

    public static boolean isSameColor(int row, int col, int size) {
        int color = paper[row][col];

        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (paper[i][j] != color) {
                    return false;
                }
            }
        }
        return true;
    }
}