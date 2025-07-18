package com.test.coding.multiplefactor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CT11653 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 2; i * i <= n; i++) {  // i는 소수 판정 필요 없음, 그냥 2부터 나누기
            while (n % i == 0) {
                bw.write(i + "\n");
                n /= i;
            }
        }

        // 마지막 남은 수가 1보다 크면 소수임 → 출력
        if (n > 1) {
            bw.write(n + "\n");
        }

        bw.flush();
        bw.close();
	}
}















