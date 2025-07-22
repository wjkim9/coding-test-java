package com.test.coding.stackqueudeque;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class CT11866 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        Deque<Integer> queue = new ArrayDeque<>();
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        for (int i=1; i<=n; i++) {
        	queue.add(i);
        }
        
        StringBuilder sb = new StringBuilder("<");
        
        while (queue.size() > 1) {
        	for (int i=0; i<k-1; i++) {
        		queue.add(queue.poll());
        	}
        	
        	sb.append(queue.poll())
        		.append(", ");
        }
        
        sb.append(queue.poll()).append(">");
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}