package com.test.coding.recurse;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CT10870 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        bw.write(fibonacci(n) + "\n");
        
        bw.flush();
        br.close();
        bw.close();
    }

	private static int fibonacci(int n) {
		if (n == 0) return 0;
		if (n == 1) return 1;
		
		return fibonacci(n-1) + fibonacci(n-2);
	}
}
