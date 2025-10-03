package com.test.coding.binarysearch;

import java.io.*;

public class CT1300 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        long low = 1;
        long high = k;
        long ans = 0;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            long count = 0;

            for (int i = 1; i <= N; i++) {
                count += Math.min(N, mid / i);
            }

            if (count < k) {
                low = mid + 1;
            } else {
                ans = mid;
                high = mid - 1;
            }
        }

        System.out.println(ans);
    }
}