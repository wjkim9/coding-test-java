package com.test.coding.multiplefactor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class CT5086 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if (a == b) break;
			
			if (b % a == 0) {
				bw.write("factor\n" );
				continue;
			}
			
			boolean multiple = false;
			
			for (int i=1; i<=a; i++) {
				if (i*b == a) multiple = true;
				if (i*b > a) break;
			}
			
			if (multiple) {
				bw.write("multiple\n");
				continue;
			}
			
			bw.write("neither\n");
			
		}
		
		br.close();
		bw.flush();
		bw.close();
		
	}
}












