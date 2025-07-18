package com.test.coding.advance1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CT10988 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String word = br.readLine();
		br.close();
		
		String reverseWord = new StringBuilder(word).reverse().toString();
		
		if (word.equals(reverseWord)) {
			bw.write(1 + "");
		} else {
			bw.write(0 + "");
		}
		
        bw.flush();
        bw.close();
	}
}
