package com.test.coding.divideconquer;

import java.io.*;
import java.util.*;

public class CT11401 {

    final static long P = 1000000007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long N = Long.parseLong(st.nextToken());
        long K = Long.parseLong(st.nextToken());

        long numerator = factorial(N);

        long denominator = (factorial(K) * factorial(N - K)) % P;

        long denominatorInverse = power(denominator, P - 2);

        long result = (numerator * denominatorInverse) % P;

        System.out.println(result);
    }

    public static long factorial(long n) {
        long result = 1L;
        for (long i = 2; i <= n; i++) {
            result = (result * i) % P;
        }
        return result;
    }

    public static long power(long base, long exp) {
        long result = 1L;
        base %= P;

        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % P;
            }
            base = (base * base) % P;
            exp /= 2;
        }
        return result;
    }
}