package com.test.coding.arraytwo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class CT2738 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int row = Integer.parseInt(st.nextToken());
		int col = Integer.parseInt(st.nextToken());
		
		int[][] arr1 = new int[row][col];
		int[][] arr2 = new int[row][col];
		int[][] sum = new int[row][col];
		
		for (int i=0; i<row; i++) {
			StringTokenizer rowSt = new StringTokenizer(br.readLine());
			for (int j=0; j<col; j++) {
				arr1[i][j] = Integer.parseInt(rowSt.nextToken());
			}
		}
		
		for (int i=0; i<row; i++) {
			StringTokenizer rowSt = new StringTokenizer(br.readLine());
			for (int j=0; j<col; j++) {
				arr2[i][j] = Integer.parseInt(rowSt.nextToken());
			}
		}
		br.close();
		
		for (int i=0; i<row; i++) {
			for (int j=0; j<col; j++) {
				sum[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i<row; i++) {
			for (int j=0; j<col; j++) {
				sb.append(sum[i][j]).append(" ");
			}
			sb.append("\n");
		}
		
		bw.write(sb.toString());
        bw.flush();
        bw.close();
	}
}
