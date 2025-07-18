package com.test.coding.condition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;

public class CT2480 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        
        br.close();
        
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        
        if (a == b && b == c) { //셋 다 같음
        	System.out.println((10000 + (a * 1000)));
        	return;
        }
        
        if (a != b && a != c && b != c) { //셋 다 다름
        	int max = Math.max(a, Math.max(b, c));
        	System.out.println(max * 100);
        	return;
        }
        
        if (a == b) {
        	System.out.println((1000 + (a * 100)));
        	return;
        }
        
        if (a == c) {
        	System.out.println((1000 + (a * 100)));
        	return;
        }
        
        if (b == c) {
        	System.out.println((1000 + (b * 100)));
        	return;
        }
        
	}

}
