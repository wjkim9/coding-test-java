package com.test.coding.arrayone;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class CT10810 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer fst = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(fst.nextToken());
		int m = Integer.parseInt(fst.nextToken());
		
		int[] bucket = new int[n];
		
		for (int i=0; i<m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			for (int loop=a-1; loop<=b-1; loop++) {
				bucket[loop] = c;
			}
		}
		
		for (int i=0; i<n; i++) {
			bw.write(bucket[i] + " ");
		}
		
		br.close();
        bw.flush();
        bw.close();
	}
}
