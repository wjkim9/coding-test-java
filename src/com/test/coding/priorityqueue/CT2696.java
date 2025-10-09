package com.test.coding.priorityqueue;

import java.io.*;
import java.util.*;

public class CT2696 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder resultSb = new StringBuilder();

        while (testCase-- > 0) {
            int m = Integer.parseInt(br.readLine());

            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();

            List<Integer> medians = new ArrayList<>();
            StringTokenizer st = null;

            for (int i = 0; i < m; i++) {
                if (i % 10 == 0) {
                    st = new StringTokenizer(br.readLine());
                }

                int num = Integer.parseInt(st.nextToken());

                if (maxHeap.size() == minHeap.size()) {
                    maxHeap.add(num);
                } else {
                    minHeap.add(num);
                }

                if (!minHeap.isEmpty() && maxHeap.peek() > minHeap.peek()) {
                    int tempMax = maxHeap.poll();
                    int tempMin = minHeap.poll();
                    maxHeap.add(tempMin);
                    minHeap.add(tempMax);
                }

                if (i % 2 == 0) {
                    medians.add(maxHeap.peek());
                }
            }

            resultSb.append(medians.size()).append("\n");
            for (int i = 0; i < medians.size(); i++) {
                resultSb.append(medians.get(i)).append(" ");
                if ((i + 1) % 10 == 0) {
                    resultSb.append("\n");
                }
            }
            if (medians.size() % 10 != 0) {
                resultSb.append("\n");
            }
        }
        System.out.print(resultSb.toString());
    }
}