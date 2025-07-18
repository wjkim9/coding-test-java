package com.test.coding.geometry1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class CT5073 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] arr = new int[3];
			
			arr[0] = Integer.parseInt(st.nextToken());
			
			if (arr[0] == 0) break;
			
			arr[1] = Integer.parseInt(st.nextToken());
			arr[2] = Integer.parseInt(st.nextToken());
			
			for(int i = 0; i < arr.length-1; i++) {
		        for(int j = 0; j < arr.length-1-i; j++) {
		            if(arr[j] < arr[j+1]) {
		                int temp = arr[j];
		                arr[j] = arr[j+1];
		                arr[j+1] = temp;
		            }
		        }
		    }

			if (arr[1] + arr[2] <= arr[0]) {
				bw.write("Invalid\n");
				continue;
			}
			
			if (arr[0] == arr[1] && arr[0] == arr[2]) {
				bw.write("Equilateral\n");
			} else if (arr[0] != arr[1] && arr[0] != arr[2] && arr[1] != arr[2]) {
				bw.write("Scalene\n");
			} else {
				bw.write("Isosceles\n");
			}
			
		}
		br.close();
		
		bw.flush();
		bw.close();
	}
}








