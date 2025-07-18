package com.test.coding.condition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CT14681 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
		
        br.close();
        
        int quad = checkQuad(x, y);
        
        System.out.println(quad);

	}

	private static int checkQuad(int x, int y) {

		if (x > 0 && y > 0) {
			return 1;
		}
		
		if (x < 0 && y > 0) {
			return 2;
		}
		
		if (x < 0 && y < 0) {
			return 3;
		}
		
		if (x > 0 && y < 0) {
			return 4;
		}
		
		return 0;
	}
}
