package com.test.coding.arrayone;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CT2562 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = 0;
		int max = 0;
		
		for (int i=1; i<=9; i++) {
			int temp = Integer.parseInt(br.readLine());
			if (temp > max) {
				max = temp;
				n = i;
			}
		}
		br.close();

		bw.write(String.valueOf(max));
		bw.newLine();
		bw.write(String.valueOf(n));
		
        bw.flush();
        bw.close();
	}
}
