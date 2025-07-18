package com.test.coding.string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CT5622 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String word = br.readLine();
		br.close();
		
		int sum = 0;
		
		for (int i=0; i<word.length(); i++) {
			
			if ( word.charAt(i) >= 'A' && word.charAt(i) <= 'C') {
				sum += 3;
			}
			
			if ( word.charAt(i) >= 'D' && word.charAt(i) <= 'F') {
				sum += 4;
			}
			
			if ( word.charAt(i) >= 'G' && word.charAt(i) <= 'I') {
				sum += 5;
			}
			
			if ( word.charAt(i) >= 'J' && word.charAt(i) <= 'L') {
				sum += 6;
			}
			
			if ( word.charAt(i) >= 'M' && word.charAt(i) <= 'O') {
				sum += 7;
			}
			
			if ( word.charAt(i) >= 'P' && word.charAt(i) <= 'S') {
				sum += 8;
			}
			
			if ( word.charAt(i) >= 'T' && word.charAt(i) <= 'V') {
				sum += 9;
			}
			
			if ( word.charAt(i) >= 'W' && word.charAt(i) <= 'Z') {
				sum += 10;
			}
			
		}
		
		bw.write(sum + "");
		bw.flush();
        bw.close();
	}
}













