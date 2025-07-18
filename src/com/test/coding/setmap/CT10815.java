package com.test.coding.setmap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class CT10815 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		Set<Integer> set = new HashSet<Integer>();
		
		for (int i=0; i<n; i++) {
			set.add(Integer.parseInt(st.nextToken()));
		}
		
		n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		br.close();
		
		for (int i=0; i<n; i++) {
			if (set.contains(Integer.parseInt(st.nextToken()))) {
				bw.write(1 + " ");
			} else {
				bw.write(0 + " ");
			}
		}
		    
		bw.flush();
		bw.close();
	}
}
