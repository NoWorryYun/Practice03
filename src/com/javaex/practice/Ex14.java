package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		int sum = 0;
		for (int x = 1; x < num; x++) {
			System.out.print(x + "+");
			sum = (sum + x);
		}
		System.out.println(num);
		System.out.println("합계: " + sum);
		sc.close();

	}

}
