package com.test.coding.multiplefactor2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class CT1934 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		for (int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			int lcm = x * y / gcd(x,y);
			bw.write(lcm + "\n");
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
}
