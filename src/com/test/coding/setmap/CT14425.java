package com.test.coding.setmap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class CT14425 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		Set<String> set = new HashSet<>();
		
		for (int i=0; i<n; i++) {
			set.add(br.readLine());
		}
		
		int cnt = 0;
		
		for (int i=0; i<m; i++) {
			if (set.contains(br.readLine())) {
				cnt++;
			}
		}
		
		br.close();
		bw.write(cnt + "");
		bw.flush();
		bw.close();
	}
}
