package com.test.coding.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CT25314 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine()) / 4;
        
        br.close();
        
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<cnt; i++) {
        	sb.append("long ");
        }
        
        sb.append("int");
        
        System.out.println(sb.toString());
        
	}
}
