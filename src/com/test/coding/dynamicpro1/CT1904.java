package com.test.coding.dynamicpro1;

import java.io.*;
import java.util.*;

public class CT1904 {
	
	 static List<List<int[]>> result = new ArrayList<>();
	
	 public static void main(String[] args) throws Exception {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int n = Integer.parseInt(br.readLine());

	        if (n == 1) {
	            System.out.println(1);
	            return;
	        }
	        if (n == 2) {
	            System.out.println(2);
	            return;
	        }

	        int a = 1;
	        int b = 2;
	        for (int i = 3; i <= n; i++) {
	            int c = (a + b) % 15746;
	            a = b;
	            b = c;
	        }
	        System.out.println(b);
	    }

}
