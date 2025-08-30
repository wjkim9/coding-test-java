package com.test.coding.multiplefactor2;

import java.io.*;

public class CT13909 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine().trim());
        
        System.out.println((long)Math.floor(Math.sqrt(N)));
	}
}
