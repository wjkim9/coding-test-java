package com.test.coding.multiplefactor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class CT2501 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();

		int n = Integer.parseInt(st.nextToken());
		int index = Integer.parseInt(st.nextToken());
		
		List<Integer> factorList = new ArrayList<Integer>();
		
		for (int i=1; i<=n; i++) {
			if (n % i == 0) {
				factorList.add(i);
				continue;
			}
		}

		if (factorList.size() >= index) {
			System.out.println(factorList.get(index-1));
		} else {
			System.out.println(0);
		}
	}
}















