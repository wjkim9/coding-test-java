package com.test.coding.geometry1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CT14215 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[3];
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		br.close();
		
		Arrays.sort(arr);
        int a = arr[0], b = arr[1], c = arr[2];
		
        if (a + b > c) {
        	bw.write(a + b + c + "");
        } else {
        	c = a + b - 1;
        	bw.write(a + b + c + "");
        }
		
		bw.flush();
		bw.close();
	}
}
