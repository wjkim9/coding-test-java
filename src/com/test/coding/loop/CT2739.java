package com.test.coding.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;

public class CT2739 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        br.close();
        
        for (int i=1; i<=9; i++) {
        	StringBuilder sb = new StringBuilder()
        						.append(num)
        						.append(" * ")
        						.append(i)
        						.append(" = ")
        						.append(num * i);
        	System.out.println(sb);
        }
	}
}
