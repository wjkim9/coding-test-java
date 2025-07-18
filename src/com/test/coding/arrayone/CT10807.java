package com.test.coding.arrayone;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class CT10807 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int target = Integer.parseInt(br.readLine());
		br.close();
		
		int cnt = 0;
		
		for (int i=0; i<n; i++) {
			if(Integer.parseInt(st.nextToken()) == target) {
				cnt++;
			}
		}
		
		bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
	}
}
