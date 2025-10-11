package com.test.coding.divideconquer;

import java.io.*;
import java.util.*;

public class CT6549 {

    public static int[] histogram;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            if (N == 0) {
                break;
            }
            histogram = new int[N];
            for (int i = 0; i < N; i++) {
                histogram[i] = Integer.parseInt(st.nextToken());
            }
            sb.append(getArea(0, N - 1)).append('\n');
        }
        System.out.println(sb);
    }

    public static long getArea(int left, int right) {
        if (left == right) {
            return histogram[left];
        }

        int mid = (left + right) / 2;

        long leftArea = getArea(left, mid);
        long rightArea = getArea(mid + 1, right);

        long maxArea = Math.max(leftArea, rightArea);

        maxArea = Math.max(maxArea, getMidArea(left, right, mid));

        return maxArea;
    }

    public static long getMidArea(int left, int right, int mid) {
        int toLeft = mid;
        int toRight = mid;
        long height = histogram[mid];
        long maxArea = height;

        while (left < toLeft || toRight < right) {

            if (toRight < right && (toLeft == left || histogram[toLeft - 1] < histogram[toRight + 1])) {
                toRight++;
                height = Math.min(height, histogram[toRight]);
            }
            else {
                toLeft--;
                height = Math.min(height, histogram[toLeft]);
            }

            maxArea = Math.max(maxArea, height * (toRight - toLeft + 1));
        }

        return maxArea;
    }
}