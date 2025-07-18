package com.test.coding.IO;

import java.util.Scanner;

public class CT10430 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		
		String[] num = input.split(" ");
		
		int a = Integer.parseInt(num[0]);
		int b = Integer.parseInt(num[1]);
		int c = Integer.parseInt(num[2]);
		
		System.out.println((a + b) % c);
		System.out.println(((a % c) + (b % c)) % c);
		System.out.println((a * b) % c);
		System.out.println(((a % c) * (b % c) % c));
		
	}

}
