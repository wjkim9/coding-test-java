package com.test.coding.sorting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class CT2587 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] arr = new int[5];
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		br.close();
		
		Arrays.sort(arr);
		
		bw.write(Arrays.stream(arr).sum() / 5 + "\n");
		bw.write(arr[2] + "");
		
		bw.flush();
		bw.close();
	}
}
