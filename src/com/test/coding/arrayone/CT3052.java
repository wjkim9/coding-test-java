package com.test.coding.arrayone;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class CT3052 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		HashSet<Integer> hs = new HashSet<Integer>();
		
		for (int i=0; i<10; i++) {
			Integer a = Integer.parseInt(br.readLine()) % 42;
			hs.add(a);
		}

		bw.write(String.valueOf(hs.size()));
		br.close();
        bw.flush();
        bw.close();
	}
}
