package com.test.coding.geometry1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CT10101 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		br.close();
		
		if (a == 60 && b == 60 && c == 60) {
			System.out.println("Equilateral");
			return;
		}
		
		if (a + b + c != 180) {
			System.out.println("Error");
			return;
		}
		
		if (a != b && b != c && a != c) {
			System.out.println("Scalene");
		} else {
			System.out.println("Isosceles");
		}
	}
}








