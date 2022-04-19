package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요");

		int num1 = 0;

		for (int n = 1; n <= 5; n++) {
			System.out.print("숫자 :");
			int num2 = sc.nextInt();
			if (num1 < num2) {
				num1 = num2;
			}

		}
		System.out.println("최대값은 " + num1 + "입니다.");

		sc.close();

	}

}
