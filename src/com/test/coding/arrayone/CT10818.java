package com.test.coding.arrayone;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class CT10818 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();

		int[] nums = new int[n];
		
		for (int i=0; i<n; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = nums[0];
		int min = nums[0];
		
		for (int i=1; i<n; i++) {
			if (nums[i] > max) max = nums[i];
			if (nums[i] < min) min = nums[i];
		}
		
		bw.write(min + " " + max);
        bw.flush();
        bw.close();
	}
}
