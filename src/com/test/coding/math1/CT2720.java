package com.test.coding.math1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CT2720 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
		    int change = Integer.parseInt(br.readLine());
		    
		    int quarter = change / 25;
		    change %= 25;
		    
		    int dime = change / 10;
		    change %= 10;
		    
		    int nickel = change / 5;
		    change %= 5;
		    
		    int penny = change;
		    
		    sb.append(String.format("%d %d %d %d\n", quarter, dime, nickel, penny));
		}
		br.close();
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		
	}
}
