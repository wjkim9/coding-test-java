package com.test.coding.arrayone;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class CT10813 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] bucket = new int[n];
		
		for (int i=0; i<n; i++) {
			bucket[i] = i + 1;
		}
		
		for (int i=0; i<m; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st2.nextToken()) - 1;
			int b = Integer.parseInt(st2.nextToken()) - 1;
			
			int temp = bucket[a];
			bucket[a] = bucket[b];
			bucket[b] = temp;
		}
		br.close();
		
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i<n; i++) {
			sb.append(bucket[i])
				.append(" ");
		}
		
		bw.write(sb.toString());
		
        bw.flush();
        bw.close();
	}
}
