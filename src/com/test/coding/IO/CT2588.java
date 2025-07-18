package com.test.coding.IO;

import java.util.Scanner;

public class CT2588 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt();
		scan.nextLine();
		int num2 = scan.nextInt();
		
		System.out.println(num1 * (num2 % 10));
		System.out.println(num1 * (num2 % 100 / 10));
		System.out.println(num1 * (num2 / 100));
		System.out.println(num1 * num2);
		
	}

}
