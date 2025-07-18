package com.test.coding.condition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;

public class CT2525 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int cookingTime = Integer.parseInt(br.readLine());
        
        int hour = Integer.parseInt(input[0]);
        int minute = Integer.parseInt(input[1]);
        
        LocalTime time = LocalTime.of(hour, minute).plusMinutes(cookingTime);
        StringBuilder result = new StringBuilder()
        									.append(time.getHour())
							        		.append(" ")
							        		.append(time.getMinute());
        System.out.println(result.toString());
		
        br.close();

	}

}
