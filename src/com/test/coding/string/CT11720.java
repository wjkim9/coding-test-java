package com.test.coding.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CT11720 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int sum = 0;
		
		for (int i=0; i<n; i++) {
			int a = br.read() - '0';
			sum += a;
		}
		
		br.close();
		
		System.out.println(sum);
	}
}
