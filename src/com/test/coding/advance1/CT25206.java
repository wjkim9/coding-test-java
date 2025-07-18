package com.test.coding.advance1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class CT25206 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		List<Double> score = new ArrayList<Double>();
		List<String> grade = new ArrayList<String>();
		
		String line;
		while ((line = br.readLine()) != null) {
			if (line.equals("")) break;
			StringTokenizer st = new StringTokenizer(line);
			st.nextToken();
			score.add(Double.parseDouble(st.nextToken()));
			grade.add(st.nextToken());
		}
		br.close();
		
		double gradeSum = 0;
		double scoreSum = 0;
		
		for (int i=0; i<score.size(); i++) {
			
			if (grade.get(i).equals("P")) {
				continue;
			}
			
			scoreSum += score.get(i);
			if (grade.get(i).equals("A+")) gradeSum += score.get(i) * 4.5;
			if (grade.get(i).equals("A0")) gradeSum += score.get(i) * 4.0;
			if (grade.get(i).equals("B+")) gradeSum += score.get(i) * 3.5;
			if (grade.get(i).equals("B0")) gradeSum += score.get(i) * 3.0;
			if (grade.get(i).equals("C+")) gradeSum += score.get(i) * 2.5;
			if (grade.get(i).equals("C0")) gradeSum += score.get(i) * 2.0;
			if (grade.get(i).equals("D+")) gradeSum += score.get(i) * 1.5;
			if (grade.get(i).equals("D0")) gradeSum += score.get(i) * 1.0;
			if (grade.get(i).equals("F")) gradeSum += score.get(i) * 0.0;
			
		}
		
		System.out.println(gradeSum/scoreSum);
		
	}
}










