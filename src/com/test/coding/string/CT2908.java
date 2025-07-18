package com.test.coding.string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class CT2908 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int reverseA = reverseNum(a);
		int reverseB = reverseNum(b);
		
		bw.write((reverseA > reverseB ? reverseA : reverseB) + "");

		bw.flush();
        bw.close();
	}

	private static int reverseNum(int num) {

		int temp = 0;
		
		while (num > 0) {
			temp = temp * 10 + (num % 10);
			num /= 10;
		}
		
		return temp;
	}
	
}













