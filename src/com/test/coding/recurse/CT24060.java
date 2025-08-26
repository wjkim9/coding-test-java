package com.test.coding.recurse;

import java.io.*;
import java.util.*;

public class CT24060 {
    static int N, K;
    static int[] A, tmp;
    static int cnt = 0, ans = -1;

    static void mergeSort(int l, int r) {
        if (l >= r) return;
        int m = (l + r) >>> 1;    // (l+r)/2 오버플로 방지
        mergeSort(l, m);
        mergeSort(m + 1, r);
        merge(l, m, r);
    }

    static void merge(int l, int m, int r) {
        int i = l, j = m + 1, t = 0;

        // 1) 두 구간 병합: tmp에 채우기 (카운트 X)
        while (i <= m && j <= r) {
            if (A[i] <= A[j]) tmp[t++] = A[i++]; // <= 로 안정성 유지
            else              tmp[t++] = A[j++];
        }
        while (i <= m) tmp[t++] = A[i++];
        while (j <= r) tmp[t++] = A[j++];

        // 2) tmp -> A 되복사: 여기서만 저장 카운트
        i = l; t = 0;
        while (i <= r) {
            A[i] = tmp[t++];
            cnt++;
            if (cnt == K) ans = A[i];
            i++;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        A = new int[N];
        tmp = new int[N];      // 한 번만 만들고 재사용 (성능)
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) A[i] = Integer.parseInt(st.nextToken());

        mergeSort(0, N - 1);
        System.out.println(ans);
    }
}
