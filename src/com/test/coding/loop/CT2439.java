package com.test.coding.loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CT2439 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        br.close();
        
        for (int i=0; i<num; i++) {
        	for (int j=0; j<num - i - 1; j++) {
        		bw.write(" ");
        	}
        	for (int k=0; k<i+1; k++) {
        		bw.write("*");
        	}
        	bw.newLine();
        }
        
        bw.flush();
        bw.close();
	}
}
