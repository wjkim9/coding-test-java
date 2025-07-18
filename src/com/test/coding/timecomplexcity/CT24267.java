package com.test.coding.timecomplexcity;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CT24267 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		long n = Long.parseLong(br.readLine());
		br.close();
		
		bw.write((n * (n - 1) * (n - 2) / 6 + "\n"));
		bw.write(3 + "");
		bw.flush();
		bw.close();
	}
}
