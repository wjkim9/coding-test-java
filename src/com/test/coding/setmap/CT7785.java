package com.test.coding.setmap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class CT7785 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		Set<String> set = new HashSet<>();
		
		for (int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String name = st.nextToken();
			String stat = st.nextToken();
			
			if (stat.equals("enter")) {
				set.add(name);
			} else {
				set.remove(name);
			}
		}
		
		set.stream()
			.sorted(Comparator.reverseOrder())
			.forEach(name -> {
				try {
					bw.write(name + "\n");
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
		
		br.close();
		bw.flush();
		bw.close();
	}
}
