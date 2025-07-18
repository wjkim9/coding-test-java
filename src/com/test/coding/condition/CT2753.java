package com.test.coding.condition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CT2753 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(br.readLine());
		
        br.close();
        
        int result = checkYear(year);
        
        System.out.println(result);

	}

	private static int checkYear(int year) {

        if (year % 4 != 0) {
        	return 0;
        }
		
        if (year % 400 == 0) {
        	return 1;
        }
        
        if (year % 100 == 0) {
        	return 0;
        }
		
		return 1;
	}
}
