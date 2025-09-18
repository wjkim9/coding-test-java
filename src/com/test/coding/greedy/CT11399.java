package com.test.coding.greedy;

import java.io.*;
import java.util.*;

public class CT11399 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] t = new int[N];
        for (int i = 0; i < N; i++) t[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(t); // 오름차순
        long total = 0L;
        long prefix = 0L;
        for (int i = 0; i < N; i++) {
            prefix += t[i];    // 이 사람의 대기 + 수행 시간
            total += prefix;   // 모든 사람이 기다리는 시간에 더함
        }
        System.out.println(total);
    }
}


