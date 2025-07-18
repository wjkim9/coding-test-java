package com.test.coding.multiplefactor2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class CT13241 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String input1 = st.nextToken();
		String input2 = st.nextToken();
		
		if (input1.length() < 4) {
			
			int x = Integer.parseInt(input1);
			int y = Integer.parseInt(input2);
			
			int lcm = x * y / gcd(x,y);
			
			bw.write(lcm + "");
		} else {
			
			long x = Long.parseLong(input1);
			long y = Long.parseLong(input2);
			
			long lcm = x * y / gcd(x,y);
			
			bw.write(lcm + "");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

	private static int gcd(int x, int y) {
		while (x != 0) {
			int temp = y % x;
			y = x;
			x = temp;
		}
		return y;
	}
	
	private static long gcd(long x, long y) {
		while (x != 0) {
			long temp = y % x;
			y = x;
			x = temp;
		}
		return y;
	}
}
