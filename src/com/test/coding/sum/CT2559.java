package com.test.coding.sum;

import java.io.*;
import java.util.StringTokenizer;

public class CT2559 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n + 1];
        int[] sumArr = new int[n + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sumArr[i] = sumArr[i - 1] + arr[i];
        }

        int max = Integer.MIN_VALUE;

        for (int i = k; i <= n; i++) {
            int temp = sumArr[i] - sumArr[i - k];
            if (temp > max) {
                max = temp;
            }
        }

        System.out.println(max);
        br.close();
    }
}
