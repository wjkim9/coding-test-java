package com.test.coding.recurse;

import java.io.*;
import java.util.*;

public class CT2580 {
    static final int FULL = 0x3FE; // 1..9 비트가 1인 마스크(1111111110)
    static int[][] board = new int[9][9];
    static int[] row = new int[9], col = new int[9], box = new int[9];
    static List<int[]> blanks = new ArrayList<>();
    static boolean solved = false;

    static int boxId(int r, int c) { return (r / 3) * 3 + (c / 3); }

    static void solve() {
        if (solved) return;

        // 1) MRV: 후보 가장 적은 빈칸 선택
        int br = -1, bc = -1, bestMask = 0, bestCnt = 10;
        for (int[] p : blanks) {
            int r = p[0], c = p[1];
            if (board[r][c] != 0) continue;                // 이미 채웠다면 스킵
            int b = boxId(r, c);
            int cand = (~(row[r] | col[c] | box[b])) & FULL;
            int cnt = Integer.bitCount(cand);
            if (cnt < bestCnt) {
                bestCnt = cnt; bestMask = cand; br = r; bc = c;
                if (cnt == 1) break;                      // 더 줄 수 없음
            }
        }

        // 빈칸이 더 없으면 완성
        if (bestCnt == 10) {
            printBoard();
            solved = true;
            return;
        }
        // 후보가 0이면 막다른 길
        if (bestCnt == 0) return;

        // 2) 후보 숫자들 시도 (비트 한 개씩)
        int b = boxId(br, bc);
        for (int m = bestMask; m != 0 && !solved; m &= (m - 1)) {
            int bit = m & -m;
            int d = Integer.numberOfTrailingZeros(bit);   // 1..9
            // 놓기
            board[br][bc] = d;
            row[br] |= 1 << d; col[bc] |= 1 << d; box[b] |= 1 << d;

            solve();

            // 되돌리기
            row[br] ^= 1 << d; col[bc] ^= 1 << d; box[b] ^= 1 << d;
            board[br][bc] = 0;
        }
    }

    static void printBoard() {
        StringBuilder sb = new StringBuilder(9 * 18);
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                sb.append(board[r][c]);
                if (c < 8) sb.append(' ');
            }
            sb.append('\n');
        }
        System.out.print(sb.toString());
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int r = 0; r < 9; r++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int c = 0; c < 9; c++) {
                int v = Integer.parseInt(st.nextToken());
                board[r][c] = v;
                if (v == 0) {
                    blanks.add(new int[]{r, c});
                } else {
                    int b = boxId(r, c);
                    int bit = 1 << v;
                    row[r] |= bit; col[c] |= bit; box[b] |= bit;
                }
            }
        }
        solve();
    }
}
