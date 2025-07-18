package com.test.coding.arraytwo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class CT2563 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int loop = Integer.parseInt(br.readLine());

		int[][] arr = new int[100][100];
		
		for (int i=0; i<loop; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			for (int row=x; row<x+10; row++) {
				for (int col=y; col<y+10; col++) {
					arr[row][col] = 1;
				}
			}
		}
		br.close();
		
		int sum = 0;
		
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		
		bw.write(sum + "");
        bw.flush();
        bw.close();
	}
}
