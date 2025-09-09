package com.test.coding.dynamicpro1;

import java.io.*;
import java.util.*;

public class CT2565 {
    static class Pair {
        int a, b;
        Pair(int a, int b) { this.a = a; this.b = b; }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        Pair[] arr = new Pair[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[i] = new Pair(a, b);
        }

        // 1) A 오름차순 (tie: B 오름차순)
        Arrays.sort(arr, (p1, p2) -> (p1.a != p2.a) ? p1.a - p2.a : p1.b - p2.b);

        // 2) B의 LIS 길이 (엄격 증가) - patience sorting
        int[] tails = new int[N];
        int len = 0;
        for (int i = 0; i < N; i++) {
            int x = arr[i].b;
            int idx = Arrays.binarySearch(tails, 0, len, x); // lower_bound
            if (idx < 0) idx = -(idx + 1);
            tails[idx] = x;
            if (idx == len) len++;
        }

        // 3) 최소 제거 = N - LIS
        System.out.println(N - len);
    }
}
