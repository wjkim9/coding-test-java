
package com.test.coding.combinatorics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CT10872 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		long input = Long.parseLong(br.readLine());
		
		long result = factorial(input);
		
		bw.write(result + "");
		
		br.close();
		bw.flush();
		bw.close();
	}

	private static long factorial(long input) {
		if (input == 0) return 1; 
		
		long result = input * factorial(input-1);
		
		return result;
	}
}
