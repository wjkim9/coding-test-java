package com.test.coding.sorting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CT18870 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();
		
		int[] arr = new int[n];
		
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] sortedArr = Arrays.copyOf(arr, n);
		
		Arrays.sort(sortedArr);
		
		for (int i=0; i<arr.length; i++) {
		    int left = 0, right = arr.length;
		    while (left < right) {
		        int mid = (left + right) / 2;
		        if (sortedArr[mid] < arr[i]) {
		            left = mid + 1;
		        } else {
		            right = mid;
		        }
		    }
		    bw.write(left + " ");
		}
		    
		bw.flush();
		bw.close();
	}
}
