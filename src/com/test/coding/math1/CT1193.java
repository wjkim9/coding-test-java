package com.test.coding.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CT1193 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		int cnt = 1;
		
		while (true) {
			
			if (n - cnt > 0) {
				n -= cnt;
				cnt++;
				continue;
			}
			break;
		}
		
		if (cnt % 2 == 0) {
		    System.out.println(n + "/" + (cnt + 1 - n));
		} else {
		    System.out.println((cnt + 1 - n) + "/" + n);
		}
	}
}
