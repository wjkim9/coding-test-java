package com.test.coding.binarysearch;

import java.io.*;
import java.util.*;

public class CT12015 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        ArrayList<Integer> lis = new ArrayList<>();
        lis.add(0);

        for (int num : A) {
            if (num > lis.get(lis.size() - 1)) {
                lis.add(num);
            } else {
                int low = 0;
                int high = lis.size() - 1;

                while (low < high) {
                    int mid = low + (high - low) / 2;
                    if (lis.get(mid) < num) {
                        low = mid + 1;
                    } else {
                        high = mid;
                    }
                }
                lis.set(high, num);
            }
        }

        System.out.println(lis.size() - 1);
    }
}