
package com.test.coding.advance2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class CT25192 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        Set<String> set = new HashSet<>();
        
        for (int i=0; i<n; i++) {
        	String input = br.readLine();
        	
        	if (input.equals("ENTER")) {
        		count += set.size();
        		set.removeAll(set);
        		
        	} else {
        		set.add(input);
        		
        	}
        }
        
        System.out.println(count + set.size());
    }
}
