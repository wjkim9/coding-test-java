package com.test.coding.greedy;

import java.io.*;
import java.util.*;

public class CT1541 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] subtractionParts = br.readLine().split("-");

        int result = 0;

        String[] firstPartNumbers = subtractionParts[0].split("\\+");
        for (String numStr : firstPartNumbers) {
            result += Integer.parseInt(numStr);
        }

        for (int i = 1; i < subtractionParts.length; i++) {
            String[] otherPartNumbers = subtractionParts[i].split("\\+");
            for (String numStr : otherPartNumbers) {
                result -= Integer.parseInt(numStr);
            }
        }

        System.out.println(result);
    }
}

