package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int money = 0;
		
		while(true) {
		System.out.println("1. 예금" + "" + "2. 출금" + "" + "3. 잔고" + "" + "4. 종료");
		System.out.print("선택>");
		int pick = sc.nextInt();
		if(pick == 4) {
			System.out.println("프로그램 종료");
			break;
		}else if(pick == 1) {
			System.out.print("예금액>");
			int sum = sc.nextInt();
			money = sum + money;
		}else if(pick == 2) {
			System.out.print("출금액>");
			int minus = sc.nextInt();
			money = money - minus;
		}else if(pick == 3) {
			System.out.println("잔고액>" + money);
		}else {
			System.out.println("다시입력해주세요");
		}
		}
		
		sc.close();
	}

}
