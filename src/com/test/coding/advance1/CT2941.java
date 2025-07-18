package com.test.coding.advance1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CT2941 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String word = br.readLine();
		
		word = word.replaceAll("c=", "1");
		word = word.replaceAll("c-", "1");
		word = word.replaceAll("dz=", "1");
		word = word.replaceAll("d-", "1");
		word = word.replaceAll("lj", "1");
		word = word.replaceAll("nj", "1");
		word = word.replaceAll("s=", "1");
		word = word.replaceAll("z=", "1");

		System.out.println(word.length());
	}
}

















