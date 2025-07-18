package com.test.coding.arraytwo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class CT2566 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[][] arr = new int[9][9];
		
		for (int i=0; i<9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j=0; j<9; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		br.close();
		
		int max = -1;
		int rowIndex = -1;
		int colIndex = -1;
		
		for (int i=0; i<9; i++) {
			for (int j=0; j<9; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
					rowIndex = i + 1;
					colIndex = j + 1;
				}
			}
		}
		
		bw.write(String.valueOf(max));
		bw.newLine();
		bw.write(String.valueOf(rowIndex));
		bw.write(" ");
		bw.write(String.valueOf(colIndex));
        bw.flush();
        bw.close();
	}
}
