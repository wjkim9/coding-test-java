package com.test.coding.IO;

import java.util.Scanner;

public class CT1008 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		
		String[] num = input.split(" ");
		
		scan.close();
		
		System.out.println((Double.parseDouble(num[0]) / Double.parseDouble(num[1])));

	}

}
