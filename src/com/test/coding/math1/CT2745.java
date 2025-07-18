package com.test.coding.math1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class CT2745 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();
		
		String n = st.nextToken();
		int base = Integer.parseInt(st.nextToken());
		
		int dec = 0;
		int pow = 0;
		
		for (int i=n.length()-1; i>=0; i--) {
			int num;
			
			if (n.charAt(i) >= 'A' && n.charAt(i) <= 'Z') {
				num = (n.charAt(i) - 'A' + 10);
			} else {
				num = (n.charAt(i) - '0');
			}
			
			dec += num * (int)Math.pow(base, pow);
			pow++;
		}
		
		bw.write(dec+"");
		
		bw.flush();
		bw.close();
		
	}
}
