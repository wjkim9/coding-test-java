package com.test.coding.binarysearch;

import java.io.*;
import java.util.*;

public class CT2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        long M = Long.parseLong(st.nextToken());

        long[] trees = new long[N];
        st = new StringTokenizer(br.readLine(), " ");
        long max = 0;

        for (int i = 0; i < N; i++) {
            trees[i] = Long.parseLong(st.nextToken());
            if (max < trees[i]) {
                max = trees[i];
            }
        }

        long low = 0;
        long high = max;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            long sum = 0;

            for (long tree : trees) {
                if (tree > mid) {
                    sum += (tree - mid);
                }
            }

            if (sum < M) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println(high);
    }
}