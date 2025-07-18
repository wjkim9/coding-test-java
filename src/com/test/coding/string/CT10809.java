package com.test.coding.string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class CT10809 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String word = br.readLine();
		br.close();
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i=0; i<word.length(); i++) {
			if (map.get((int)word.charAt(i)) == null) {
				map.put((int)word.charAt(i), i);
			}
		}
		
		for (int i=97; i<123; i++) {
			if (map.get(i) != null) {
				bw.write(map.get(i) + " ");
			} else {
				bw.write(-1 + " ");
			}
		}
		
		bw.flush();
		bw.close();
		
	}
}
