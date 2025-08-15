package com.test.coding.backtracking;

import java.io.*;

public class CT9663 {

    static int n;
    static long FULL;     // 하위 n비트가 1인 마스크
    static long ans = 0;

    // cols: 사용한 열, ld: 좌하향 대각선(다음 행으로 내려갈 때 <<1), rd: 우하향 대각선(다음 행으로 내려갈 때 >>1)
    static void dfs(long cols, long ld, long rd) {
        if (cols == FULL) { // n개의 퀸을 모두 배치
            ans++;
            return;
        }
        long avail = ~(cols | ld | rd) & FULL;  // 이번 행에서 놓을 수 있는 열 후보들
        while (avail != 0) {
            long bit = avail & -avail;          // LSB 추출
            avail -= bit;                       // 해당 자리 소거 (avail &= avail - 1 도 동일)
            dfs(cols | bit, (ld | bit) << 1 & FULL, (rd | bit) >> 1);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine().trim());
        FULL = (1L << n) - 1;
        dfs(0L, 0L, 0L);
        System.out.println(ans);
    }
}
