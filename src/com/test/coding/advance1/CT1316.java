package com.test.coding.advance1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class CT1316 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		
		for (int i=0; i<n; i++) {
			String str = br.readLine();
			
			boolean check = true;
			
			Set<Integer> group = new HashSet<Integer>();
			
		    for (int j = 0; j < str.length(); j++) {
		        char c = str.charAt(j);

		        if (group.contains((int)c)) {
		            check = false;
		            break;
		        }

		        if (j == str.length() - 1 || c != str.charAt(j + 1)) {
		            group.add((int)c);
		        }
		    }
			
			if (check) cnt++;
			
		}
		
		br.close();
		bw.write(cnt + "");
		bw.flush();
		bw.close();
	}
}










