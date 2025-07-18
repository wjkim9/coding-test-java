package com.test.coding.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CT2903 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		int sum = 2;
				
		for (int i=0; i<n; i++) {
			sum += (int)Math.pow(2, i);
		}
		
		System.out.println((int)Math.pow(sum, 2));
		
	}
}
