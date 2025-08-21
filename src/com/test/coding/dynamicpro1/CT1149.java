package com.test.coding.dynamicpro1;

import java.io.*;
import java.util.*;

public class CT1149 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[][] arr = new int[n][3];
        
        arr[0][0] = Integer.parseInt(st.nextToken());
        arr[0][1] = Integer.parseInt(st.nextToken());
        arr[0][2] = Integer.parseInt(st.nextToken());
        
        for (int i=1; i<n; i++) {
        	st = new StringTokenizer(br.readLine());
        	
        	arr[i][0] = Integer.parseInt(st.nextToken());
        	arr[i][1] = Integer.parseInt(st.nextToken());
        	arr[i][2] = Integer.parseInt(st.nextToken());
        }
        
        int nr = arr[0][0];
        int ng = arr[0][1];
        int nb = arr[0][2];
        
        for (int i=1; i<n; i++) {
        	int pr = arr[i][0] + Math.min(ng, nb);
        	int pg = arr[i][1] + Math.min(nr, nb);
        	int pb = arr[i][2] + Math.min(nr, ng);
        	
        	nr = pr; ng = pg; nb = pb;
        }
        
        int min = Math.min(nr, Math.min(ng, nb));
        
        System.out.println(min);
    }
}
