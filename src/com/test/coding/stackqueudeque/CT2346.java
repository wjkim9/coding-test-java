package com.test.coding.stackqueudeque;

import java.io.*;
import java.util.*;

public class CT2346 {
    static class Node {
        int idx, move;
        Node(int i, int m) { idx = i; move = m; }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayDeque<Node> dq = new ArrayDeque<>(N);
        for (int i = 1; i <= N; i++) {
            int k = Integer.parseInt(st.nextToken());
            dq.addLast(new Node(i, k));
        }

        StringBuilder out = new StringBuilder(N * 3);
        while (!dq.isEmpty()) {
            Node cur = dq.pollFirst();           // 현재 풍선 터뜨림
            out.append(cur.idx).append(' ');
            if (dq.isEmpty()) break;             // 더 없으면 종료

            int k = cur.move;
            if (k > 0) {
                int steps = (k - 1) % dq.size(); // 왼쪽 회전
                for (int t = 0; t < steps; t++) dq.addLast(dq.pollFirst());
            } else {
                int steps = (-k) % dq.size();    // 오른쪽 회전
                for (int t = 0; t < steps; t++) dq.addFirst(dq.pollLast());
            }
        }
        System.out.println(out.toString().trim());
    }
}

