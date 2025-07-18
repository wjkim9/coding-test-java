package com.test.coding.string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CT9086 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i=0; i<n; i++) {
			String word = br.readLine();
			
			bw.write(word.charAt(0));
			bw.write(word.charAt(word.length()-1));
			bw.newLine();
		}
		br.close();
		
        bw.flush();
        bw.close();
	}
}
