package com.test.coding.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CT1018 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		int min = 65;
		
		while (true) {
			
			
		
			int color = 0;
			int cnt = 0;
			
			for (int i=0; i<8; i++) {
				String row = br.readLine();
					
				for (int j=0; j<8; j++) {
					
					switch (color) {
						case 0: 
							if (row.charAt(j) != 'B') {
								cnt++;
							}
							color = 1;
							break;
						case 1:
							if (row.charAt(j) != 'W') {
								cnt++;
							}
							color = 0;
							break;
					}
				}
			}
			
			if (64 - cnt < cnt) {
				cnt = 64 - cnt;
			}
			
			if (cnt < min) {
				min = cnt;
			}
		
		}
		
		
	}
}
