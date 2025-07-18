package com.test.coding.multiplefactor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class CT2581 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		br.close();

		List<Integer> primeList = new ArrayList<Integer>();

		for (int i=m; i<=n; i++) {
			if (i == 1) continue;
			boolean prime = true;
			
			for (int j=2; j*j<=i; j++) {
				if (i % j == 0) {
					prime = false;
					break;
				}
			}
			
			if (prime) {
				primeList.add(i);
			}
		}
		
		int sum = 0;
		
		for (int i=0; i<primeList.size(); i++) {
			sum += primeList.get(i);
		}
		
		if (primeList.isEmpty()) {
			bw.write(-1 + "");
		} else {
			bw.write(sum + "\n");
			bw.write(primeList.get(0) + "");
		}
		
		bw.flush();
		bw.close();
	}
}















