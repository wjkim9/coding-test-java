package com.test.coding.stackqueuedeck;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class CT10733 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		Deque<Integer> stack = new ArrayDeque<Integer>();
		
		for (int i=0; i<n; i++) {
			int input = Integer.parseInt(br.readLine());
			
			if (input == 0) {
				stack.pop();
				continue;
			}
			
			stack.push(input);
		}
		
		int sum = 0;
		
		for (int a : stack) {
			sum += a;
		}
		
		System.out.println(sum);
		br.close();
	}
}
