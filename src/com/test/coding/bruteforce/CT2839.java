package com.test.coding.bruteforce;

import java.io.*;

public class CT2839 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
        int min = Integer.MAX_VALUE;
        int div = n / 5;
		
		for (int i=0; i<=div; i++) {
			int temp = n - (5 * i);
			
			if (temp % 3 == 0) {
				int cnt = i + (temp / 3);
				 min = Math.min(min, cnt);
			}
		}
		
        System.out.println(min == Integer.MAX_VALUE ? -1 : min);
		br.close();
	}
}
