package com.test.coding.IO;

import java.util.Scanner;

public class CT10926 {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        StringBuilder input = new StringBuilder(scan.nextLine());
        scan.close();

        input.append("??!");

        System.out.println(input.toString());

	}

}
