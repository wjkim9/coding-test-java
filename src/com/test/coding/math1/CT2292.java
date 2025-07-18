package com.test.coding.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CT2292 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		if (n == 1) {
			System.out.println(1);
			return;
		}
		n -= 1;
		
		int cnt = 0;
		
		while (n > 0) {
			n -= 6 * (cnt + 1);
			cnt++;
		}
		
		System.out.println(cnt+1);
		
	}
}
