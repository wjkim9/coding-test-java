package com.test.coding.backtracking;

import java.io.*;
import java.util.*;

public class CT14888 {

	static int N;
	static int[] ARR;
	static int MIN = Integer.MAX_VALUE;
	static int MAX = Integer.MIN_VALUE;
	static int ADD, SUB, MUL, DIV;
	
	static void dfs(int pos, int cur, int add, int sub, int mul, int div) {
		if (pos == N) {
			MIN = Math.min(MIN, cur);
			MAX = Math.max(MAX, cur);
			return;
		}
		int x = ARR[pos];
		
		if (add > 0) {
			dfs(pos + 1, cur + x, add - 1, sub, mul, div);
		}
		if (sub > 0) {
			dfs(pos + 1, cur - x, add, sub - 1, mul, div);
		}
		if (mul > 0) {
			dfs(pos + 1, cur * x, add, sub, mul - 1, div);
		}
		if (div > 0) {
			dfs(pos+ 1 , cur / x, add, sub, mul, div - 1);
		}
	}
	
	public static void main(String[] args) throws Exception {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        N = Integer.parseInt(br.readLine());
	        ARR = new int[N];
	        
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        
	        for (int i=0; i<ARR.length; i++) {
	        	ARR[i] = Integer.parseInt(st.nextToken());
	        }
	        
	        st = new StringTokenizer(br.readLine());
	        
	        ADD = Integer.parseInt(st.nextToken());
	        SUB = Integer.parseInt(st.nextToken());
	        MUL = Integer.parseInt(st.nextToken());
	        DIV = Integer.parseInt(st.nextToken());
	        
	        dfs(1, ARR[0], ADD, SUB, MUL, DIV);
	        
	        StringBuilder sb = new StringBuilder();
	        sb.append(MAX).append("\n").append(MIN);
	        System.out.println(sb.toString());
	}
}
