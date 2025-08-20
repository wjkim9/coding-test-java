package com.test.coding.dynamicpro1;

import java.io.*;
import java.util.*;

public class CT1912 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());

        StringTokenizer st = null;
        int first = 0;
        boolean gotFirst = false;

        int best = Integer.MIN_VALUE;
        int cur  = 0;

        int read = 0;
        while (read < n) {
            if (st == null || !st.hasMoreTokens()) {
                String line = br.readLine();
                if (line == null) break;
                st = new StringTokenizer(line);
                continue;
            }
            int x = Integer.parseInt(st.nextToken());
            if (!gotFirst) { // 첫 원소 초기화
                first = x;
                cur = x;
                best = x;
                gotFirst = true;
            } else {
                cur = Math.max(x, cur + x); // x를 새로 시작 vs. 이어붙이기
                if (cur > best) best = cur;
            }
            read++;
        }

        System.out.println(best);
    }
}
