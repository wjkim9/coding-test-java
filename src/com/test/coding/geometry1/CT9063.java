package com.test.coding.geometry1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class CT9063 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		if (n == 1) {
			br.close();
			System.out.println(0);
			return;
		}
		
		int[] arrx = new int[n];
		int[] arry = new int[n];
		
		for (int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			arrx[i] = Integer.parseInt(st.nextToken());
			arry[i] = Integer.parseInt(st.nextToken());
		}
		br.close();
		
		int minX = 10001;
		int maxX = -10001;
		int minY = 10001;
		int maxY = -10001;
		
		for (int i=0; i<n; i++) {
			if (arrx[i] < minX) minX = arrx[i];
			if (arrx[i] > maxX) maxX = arrx[i];
			if (arry[i] < minY) minY = arry[i];
			if (arry[i] > maxY) maxY = arry[i];
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		if (maxX == minX || maxY == minY) {
			bw.write(0 + "");
		} else {
			bw.write((maxX - minX) * (maxY - minY) + "");
		}
		
		bw.flush();
		bw.close();
	}
}








