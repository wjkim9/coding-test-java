package com.test.coding.multiplefactor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CT1978 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();

		int[] nums = new int[n];
		
		for (int i=0; i<n; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		int cnt = 0;
		
		for (int i=0; i<nums.length; i++) {
			int temp = nums[i];
			
			if (temp == 1) continue;
			
			boolean prime = true;
			
			for (int j=2; j<temp; j++) {
				if (temp % j == 0) {
					prime = false;
					break;
				}
			}
			
			if (prime) cnt++;
		}
		System.out.println(cnt);
	}
}















