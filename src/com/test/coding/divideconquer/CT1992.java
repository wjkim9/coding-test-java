package com.test.coding.divideconquer;

import java.io.*;

public class CT1992 {

    public static int[][] video;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        video = new int[N][N];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                video[i][j] = line.charAt(j) - '0';
            }
        }

        quadTree(0, 0, N);

        System.out.println(sb);
    }

    public static void quadTree(int row, int col, int size) {

        if (isCompressible(row, col, size)) {
            sb.append(video[row][col]);
            return;
        }

        int newSize = size / 2;

        sb.append('(');

        quadTree(row, col, newSize);                           // 좌측 상단
        quadTree(row, col + newSize, newSize);                // 우측 상단
        quadTree(row + newSize, col, newSize);                // 좌측 하단
        quadTree(row + newSize, col + newSize, newSize);      // 우측 하단

        sb.append(')');
    }

    public static boolean isCompressible(int row, int col, int size) {
        int color = video[row][col];

        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (video[i][j] != color) {
                    return false;
                }
            }
        }
        return true;
    }
}