package com.test.coding.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CT19532 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();

        int[] nums = new int[6]; 
        
        for (int i = 0; i < 6; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
		
        // abcdef
        // 012345
        //x = (ec - bf) / (ae - bd)
        
//        int a = nums[0];
//        int b = nums[1];
//        int c = nums[2];
//        int d = nums[3];
//        int e = nums[4];
//        int f = nums[5];
        
		int x = ((nums[4] * nums[2]) - (nums[1] * nums[5])) / ((nums[0] * nums[4]) - (nums[1] * nums[3]));
		int y;
		if (nums[1] != 0) {
			y = (nums[2] - (nums[0] * x)) / nums[1];
		} else {
			y = (nums[5] - (nums[3] * x)) / nums[4];
		}

        //int x = ((e * c) - (b * f)) / ((a * e) - (b * d));
		//int y = (c - (a * x)) / b;
        
		System.out.println(x + " " + y);

	}
}
