package com.test.coding.advance1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CT2444 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		br.close();
		
		for (int i=0; i<n; i++) {
			
			for (int space=0; space<n-i-1; space++) {
				bw.write(" ");
			}
			
			for (int star=0; star<i+1; star++) {
				bw.write("*");
			}
			
			for (int star2=0; star2<i; star2++) {
				bw.write("*");
			}
			
			bw.newLine();
		}
		
		for (int i=n; i>1; i--) {
			
			for (int space=0; space<n-i+1; space++) {
				bw.write(" ");
			}
			
			for (int star=0; star<i-1; star++) {
				bw.write("*");
			}
			
			for (int star2=0; star2<i-2; star2++) {
				bw.write("*");
			}
			
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		
	}
}
