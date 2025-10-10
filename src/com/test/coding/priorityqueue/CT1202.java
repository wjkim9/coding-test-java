package com.test.coding.priorityqueue;

import java.io.*;
import java.util.*;

class Jewel implements Comparable<Jewel> {
    int weight;
    int value;

    public Jewel(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }

    @Override
    public int compareTo(Jewel other) {
        return this.weight - other.weight;
    }
}

public class CT1202 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Jewel[] jewels = new Jewel[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int weight = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());
            jewels[i] = new Jewel(weight, value);
        }

        int[] bags = new int[k];
        for (int i = 0; i < k; i++) {
            bags[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(jewels);
        Arrays.sort(bags);

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        long totalValue = 0;
        int jewelIndex = 0;

        for (int i = 0; i < k; i++) {
            int bagCapacity = bags[i];

            while (jewelIndex < n && jewels[jewelIndex].weight <= bagCapacity) {
                pq.add(jewels[jewelIndex].value);
                jewelIndex++;
            }

            if (!pq.isEmpty()) {
                totalValue += pq.poll();
            }
        }

        System.out.println(totalValue);
    }
}