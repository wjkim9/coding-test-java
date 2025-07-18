package com.test.coding.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CT2231 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine());

		br.close();
		//int start = Math.max(1, input - 9 * String.valueOf(input).length());
		int constructor = 0;
		//for (int i=start; i<input; i++) {		
		for (int i=1; i<input; i++) {

			int n = i;
			int sum = n + (n % 10);

			while (n/10 != 0) {
				n = (n/10);
				sum += n % 10;
			}

			if (sum == input) {
				constructor = i;
				break;
			}
		}

		System.out.println(constructor);

	}
}
