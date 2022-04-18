package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int x = sc.nextInt();
		
		for (int y = 1 ; y <= x ; y++) {
			for (int z = 1 ; z <= y ; z++) {
				System.out.print(x);
			}
			System.out.println("");
		}
		
		
		sc.close();
	}

}
