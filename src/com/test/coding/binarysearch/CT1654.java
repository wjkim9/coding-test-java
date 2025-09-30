package com.test.coding.binarysearch;

import java.io.*;
import java.util.*;

public class CT1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] cables = new int[K];
        long max = 0;

        for (int i = 0; i < K; i++) {
            cables[i] = Integer.parseInt(br.readLine());
            if (max < cables[i]) {
                max = cables[i];
            }
        }

        long low = 1;
        long high = max;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            long count = 0;

            for (int cable : cables) {
                count += (cable / mid);
            }

            if (count < N) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println(high);
    }
}