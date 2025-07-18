package com.test.coding.arrayone;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CT5597 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] nums = new int[30];
		
		for (int i=0; i<28; i++) {
			int num = Integer.parseInt(br.readLine()) - 1;
			nums[num] = 1;
		}
		br.close();
		
		for (int i=0; i<30; i++) {
			if (nums[i] == 0) bw.write((i + 1) + "\n");
		}
		
        bw.flush();
        bw.close();
	}
}
