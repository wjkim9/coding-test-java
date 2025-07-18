package com.test.coding.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CT2438 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        br.close();
        
        for (int i=0; i<num; i++) {
        	StringBuilder sb = new StringBuilder();
        	for (int j=0; j<i+1; j++) {
        		sb.append("*");
        	}
        	System.out.println(sb.toString());
        }
	}
}
