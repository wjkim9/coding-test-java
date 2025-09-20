package com.test.coding.greedy;

import java.io.*;
import java.util.*;

public class CT13305 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        long[] distances = new long[N - 1];
        long[] prices = new long[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N - 1; i++) {
            distances[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            prices[i] = Long.parseLong(st.nextToken());
        }

        long totalCost = 0;

        long minPrice = prices[0];

        for (int i = 0; i < N - 1; i++) {

            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            totalCost += minPrice * distances[i];
        }

        System.out.println(totalCost);
    }
}
