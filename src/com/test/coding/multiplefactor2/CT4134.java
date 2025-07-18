package com.test.coding.multiplefactor2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CT4134 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int rep = Integer.parseInt(br.readLine());

		for (int i = 0; i < rep; i++) {
			long n = Long.parseLong(br.readLine());

			if (n <= 2) {
				bw.write("2\n");
				continue;
			}

			if (n % 2 == 0) n++;

			while (true) {
				if (isPrime(n)) {
					bw.write(n + "\n");
					break;
				}
				n += 2;
			}
		}

		bw.flush();
		bw.close();
		br.close();
	}

	private static boolean isPrime(long num) {
		if (num == 2) return true;
		if (num < 2 || num % 2 == 0) return false;

		for (long i = 3; i * i <= num; i += 2) {
			if (num % i == 0) return false;
		}
		return true;
	}
}
