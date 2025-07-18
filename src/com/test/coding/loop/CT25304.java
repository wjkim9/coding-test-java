package com.test.coding.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CT25304 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = Integer.parseInt(br.readLine());
        int loop = Integer.parseInt(br.readLine());

        int sum = 0;
        
        for (int i=0; i<loop; i++) {
        	String[] input = br.readLine().split(" ");
        	sum += Integer.parseInt(input[0]) * Integer.parseInt(input[1]);
        }
        br.close();
        
        if (total == sum) {
        	System.out.println("Yes");
        	return;
        }
        
        System.out.println("No");
        
	}
}
