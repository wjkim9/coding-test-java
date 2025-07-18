package com.test.coding.arrayone;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class CT10871 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st1 = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		br.close();
		
		int n = Integer.parseInt(st1.nextToken());
		int x = Integer.parseInt(st1.nextToken());

		int[] nums = new int[n];
		
		for (int i=0; i<n; i++) {
			nums[i] = Integer.parseInt(st2.nextToken());
		}
		
		for (int i=0; i<n; i++) {
			if (nums[i] < x) bw.write(nums[i] + " ");
		}
		
        bw.flush();
        bw.close();
	}
}
