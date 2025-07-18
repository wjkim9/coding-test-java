package com.test.coding.string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CT11718 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String line;
		while ((line = br.readLine()) != null && !line.isEmpty()) {
		    bw.write(line);
		    bw.newLine();
		}

		br.close();
		bw.flush();
		bw.close();
	}
}
