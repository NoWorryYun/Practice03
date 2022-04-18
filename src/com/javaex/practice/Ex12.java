package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		long num = sc.nextLong();
		long n = 1l;
		for(long x = num ; x > 0 ; x--) {
			n = x*n;
		}
		System.out.println("결과값: " + n);
		
		sc.close();
	}

}
