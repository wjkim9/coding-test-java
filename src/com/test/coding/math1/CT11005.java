package com.test.coding.math1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class CT11005 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();
		
		int num = Integer.parseInt(st.nextToken());
		int base = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		
		List<Integer> restList = new ArrayList<Integer>();	
		
		while (num > 0) {
			restList.add(num % base);
			num /= base;
		}
		
		for (int i=restList.size()-1; i>=0; i--) {
			int temp;
			
			if (restList.get(i) >= 10) {
				temp = restList.get(i) - 10 + 'A';
				sb.append((char)temp);
			} else {
				temp = restList.get(i);
				sb.append(temp);
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		
	}
}
