package com.test.coding.condition;

import java.util.Scanner;

public class CT1330 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		
		String[] num = input.split(" ");
		
		scan.close();
		
		int a = Integer.parseInt(num[0]);
		int b = Integer.parseInt(num[1]);
		
		if (a > b) {
			System.out.println(">");
		}
		
		if (a < b) {
			System.out.println("<");
		}
		
		if (a == b) {
			System.out.println("==");
		}
		
	}

}
