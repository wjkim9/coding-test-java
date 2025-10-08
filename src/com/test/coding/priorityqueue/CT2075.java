package com.test.coding.priorityqueue;

import java.io.*;
import java.util.*;

public class CT2075 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int num = Integer.parseInt(st.nextToken());

                if (minHeap.size() < n) {
                    minHeap.add(num);
                } else {
                    if (num > minHeap.peek()) {
                        minHeap.poll();
                        minHeap.add(num);
                    }
                }
            }
        }

        System.out.println(minHeap.peek());
    }
}