package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		for (int x = 1; x <= num; x++) {
			if (num % x == 0) {
				System.out.println(x);
			}
		}

		sc.close();
	}

}
