package com.test.coding.divideconquer;

import java.io.*;
import java.util.*;

public class CT1629 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());

        System.out.println(power(A, B, C));
    }

    public static long power(long A, long exponent, long C) {

        if (exponent == 1) {
            return A % C;
        }

        long temp = power(A, exponent / 2, C);

        if (exponent % 2 == 1) {
            return (temp * temp % C) * A % C;
        }
        else {
            return temp * temp % C;
        }
    }
}