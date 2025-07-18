package com.test.coding.bruteforce;

import java.util.Scanner;

public class CT2798 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String input1 = scan.nextLine();
		String input2 = scan.nextLine();
		
		scan.close();
		
		String[] set = input1.split(" ");
		String[] num = input2.split(" ");
		
		int n = Integer.parseInt(set[0]);
		int max = Integer.parseInt(set[1]);
		int sum = 0;
		
		for (int i=0; i<n-2; i++) {
			for (int j=i+1; j<n-1; j++) {
				for (int k=j+1; k<n; k++) {
					
					int temp = Integer.parseInt(num[i]) + Integer.parseInt(num[j]) + Integer.parseInt(num[k]);
					
					if (temp <= max) {
						if (temp > sum) {
							sum = temp;
						}
					}
					
				}
			}
		}

		System.out.println(sum);
		
	}
}
