package com.test.coding.IO;

import java.util.Scanner;

public class CT11382 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		
		String[] num = input.split(" ");
		
//		int a = Integer.parseInt(num[0]);
//		int b = Integer.parseInt(num[1]);
//		int c = Integer.parseInt(num[2]);
		
		System.out.println((Long.parseLong(num[0]) + Long.parseLong(num[1]) + Long.parseLong(num[2])));
		
	}

}
