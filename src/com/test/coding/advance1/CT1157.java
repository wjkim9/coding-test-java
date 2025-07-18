package com.test.coding.advance1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CT1157 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String word = br.readLine().toUpperCase();
		
		int[] arr = new int[26];
		
		for (int i=0; i<word.length(); i++) {
			arr[word.charAt(i) - 'A']++;
		}
		
		int max = -1;
		int maxIndex = -1;
		boolean duplicate = false;
		
		for (int i = 0; i < 26; i++) {
			if (i > max) {
				max = arr[i];
				maxIndex = i;
				duplicate = false;
			} else if (i == max) {
				duplicate = true;
			}
		}
		
		if (duplicate) {
			System.out.println("?");
		} else {
			System.out.println((char)(maxIndex + 'A'));
		}
	}
}

















