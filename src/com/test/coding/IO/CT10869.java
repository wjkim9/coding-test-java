package com.test.coding.IO;

import java.util.Scanner;

public class CT10869 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		
		String[] num = input.split(" ");
		
		scan.close();
		
		//첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.
		System.out.println((Integer.parseInt(num[0]) + Integer.parseInt(num[1])));
		System.out.println((Integer.parseInt(num[0]) - Integer.parseInt(num[1])));
		System.out.println((Integer.parseInt(num[0]) * Integer.parseInt(num[1])));
		System.out.println((Integer.parseInt(num[0]) / Integer.parseInt(num[1])));
		System.out.println((Integer.parseInt(num[0]) % Integer.parseInt(num[1])));

	}

}
