package com.test.coding.binarysearch;

import java.io.*;
import java.util.*;

public class CT2110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int[] houses = new int[N];
        for (int i = 0; i < N; i++) {
            houses[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(houses);

        int low = 1;
        int high = houses[N - 1] - houses[0];
        int result = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int count = 1;
            int lastInstalledPos = houses[0];

            for (int i = 1; i < N; i++) {
                if (houses[i] - lastInstalledPos >= mid) {
                    count++;
                    lastInstalledPos = houses[i];
                }
            }

            if (count >= C) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println(result);
    }
}