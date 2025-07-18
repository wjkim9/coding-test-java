package com.test.coding.condition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CT9498 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int score = Integer.parseInt(br.readLine());
		
        br.close();
        
        if (score <= 100 && score >= 90) {
        	System.out.println("A");
        	return;
        }
        
        if (score <= 89 && score >= 80) {
        	System.out.println("B");
        	return;
        }

        if (score <= 79 && score >= 70) {
        	System.out.println("C");
        	return;
        }
        
        if (score <= 69 && score >= 60) {
        	System.out.println("D");
        	return;
        }
        
        System.out.println("F");

	}
}
