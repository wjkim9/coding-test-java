package com.test.coding.advance1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class CT3003 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] goal = {1, 1, 2, 2, 2, 8};
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();
		
		int[] input = new int[6];
		
		for (int i=0; i<6; i++) {
			input[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i=0; i<6; i++) {
			goal[i] = goal[i] - input[i];
		}
		
		for (int i : goal) {
			bw.write(i + " ");
		}
		
        bw.flush();
        bw.close();
	}
}
