package com.test.coding.arrayone;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class CT10811 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int[] nums = new int[a];
		
		for (int i=0; i<a; i++) {
			nums[i] = i+1;
		}
		
		for (int i=0; i<b; i++) {
			StringTokenizer sst = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(sst.nextToken()) - 1;
			int m = Integer.parseInt(sst.nextToken()) - 1;
			
			int[] temp = new int[a];
			
			for (int j=n; j<=m; j++) {
				temp[j] = nums[j];
			}
			
			int cnt = 0;

			for (int j=n; j<=m; j++) {
				nums[j] = temp[m - cnt];
				cnt++;
			}

		}
		
		for (int i=0; i<a; i++) {
			bw.write(nums[i] + " ");
		}
		
		br.close();
        bw.flush();
        bw.close();
	}
}
