package com.test.coding.sorting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CT10814 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		
		Member[] arr = new Member[n];
		
		for (int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			Member m = new Member(Integer.parseInt(st.nextToken()), 
								st.nextToken(), 
								i);
			
			arr[i] = m;
		}
		br.close();

		Arrays.sort(arr, (m1, m2) -> {
			if (m1.age == m2.age) {
				return m1.seq - m2.seq;
			}
			
			return m1.age - m2.age;
		});
		
		for (Member m : arr) {
			bw.write(m.age + " " + m.name + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}

class Member {
	int age;
	String name;
	int seq;
	
	public Member (int age, String name, int seq) {
		this.age = age;
		this.name = name;
		this.seq = seq;
	}
}