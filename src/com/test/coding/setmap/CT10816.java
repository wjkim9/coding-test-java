package com.test.coding.setmap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class CT10816 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		
		Map<Integer, Integer> deck = new HashMap<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i=0; i<n; i++) {
			int input = Integer.parseInt(st.nextToken());
			
			if (deck.get(input) == null) {
				deck.put(input, 1);
			} else {
				deck.replace(input, deck.get(input) + 1);
			}
		}
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		for (int i=0; i<m; i++) {
			int input = Integer.parseInt(st.nextToken());
			
			if (deck.get(input) == null) {
				bw.write(0 + " ");
			} else {
				bw.write(deck.get(input) + " ");
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
