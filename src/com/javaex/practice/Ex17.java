package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();

		for(int y = 1 ; y <= num ; y++) {
			for(int x = y ; x <= num ; x++) {
				System.out.print("*");
			
			}
			System.out.println("");
		}
		
		
		
		
		
		sc.close();
	}

}
