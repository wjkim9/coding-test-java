package com.test.coding.stackqueuedeck;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class CT12789 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> stack = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int index = 1;
        boolean isValid = true;
        
        for (int i = 0; i < n; i++) {
        	int now = Integer.parseInt(st.nextToken());
            
        	if (now == index) {
        		index++;
        		continue;
        	}
        	
        	while (!stack.isEmpty() && stack.peek() == index) {
        		stack.pop();
        		index++;
        	}
        	
        	if (now == index) {
        		index++;
        		continue;
        	}
        	
        	if (!stack.isEmpty() && stack.peek() < now) {
        		isValid = false;
        		break;
        	}
        	
        	stack.push(now);
        }
        
        if (isValid) {
        	bw.write("Nice");
        } else {
        	bw.write("Sad");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}