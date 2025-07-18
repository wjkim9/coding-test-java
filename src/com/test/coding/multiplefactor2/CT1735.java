package com.test.coding.multiplefactor2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class CT1735 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int nume1 = Integer.parseInt(st.nextToken());
		int denomi1 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		int nume2 = Integer.parseInt(st.nextToken());
		int denomi2 = Integer.parseInt(st.nextToken());
		
		int nume = (nume1 * denomi2) + (nume2 * denomi1);
		int denomi = denomi1 * denomi2;
		int gcd = gcd(nume, denomi);
		
		bw.write(nume / gcd + " " + denomi / gcd);
		
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
