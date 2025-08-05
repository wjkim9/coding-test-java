package com.test.coding.recurse;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class CT11729 {
	
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        
        Deque<Integer> pole1 = new ArrayDeque<>();
        Deque<Integer> pole2 = new ArrayDeque<>();
        Deque<Integer> pole3 = new ArrayDeque<>();
        
        for (int i=n; i>0; i--) {
        	pole1.push(i);
        }
        
        
        
        
        
        bw.flush();
        br.close();
        bw.close();
    }

}
