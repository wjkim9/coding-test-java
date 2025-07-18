package com.test.coding.arrayone;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CT1546 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();
		
		int[] nums = new int[num];
		
		for (int i=0; i<num; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = findMax(nums);
		
		double[] score = new double[num];
		
		for (int i=0; i<num; i++) {
			score[i] = (double)nums[i] / max * 100;
		}
		
		double sum = 0;
		
		for (double d : score) {
			sum += d;
		}
		
		bw.write(String.valueOf(sum/score.length));
        bw.flush();
        bw.close();
	}
	
	public static int findMax(int[] arr) {
        return Arrays.stream(arr).max().orElseThrow();
    }

}
