package com.test.coding.IO;

import java.util.Scanner;

public class CT1001 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		
		String[] num = input.split(" ");
		
		scan.close();
		
		System.out.println((Integer.parseInt(num[0]) - Integer.parseInt(num[1])));

	}

}
