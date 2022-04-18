package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		System.out.println("숫자를 입력하세요");
		int n = sc.nextInt();
		for(int i = n ; i > 0 ; i=i-2) {
				num = (num + i);
		}System.out.println("결과값: " + num);
		
		sc.close();
	}

}
