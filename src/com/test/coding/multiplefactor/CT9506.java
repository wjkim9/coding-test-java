package com.test.coding.multiplefactor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class CT9506 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n==-1) break;
			
			List<Integer> factorList = new ArrayList<Integer>();

			for (int i=1; i<n; i++) {
				if (n % i == 0) {
					factorList.add(i);
					continue;
				}
			}

			int sum = 0;
			
			for (int factor : factorList) {
				sum += factor;
			}

			if (sum == n) {
				StringBuilder sb = new StringBuilder();
				
				sb.append(n).append(" = ").append("1");
				
				for (int i=1; i<factorList.size(); i++) {
					sb.append(" + ").append(factorList.get(i));
				}
				sb.append("\n");
				
				bw.write(sb.toString());
			} else {
				bw.write(n + " is NOT perfect.\n");
			}
		}
		br.close();
		
		bw.flush();
		bw.close();
	}
}















