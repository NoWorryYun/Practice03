package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int dap = (int)(Math.random()*100)+1;

		System.out.println("================================");
		System.out.println("\t[숫자맞추기게임 시작]");
		System.out.println("================================");

		while (true) {
			System.out.print(">>");
			int num = sc.nextInt();
			sc.nextLine();
			if (num == dap) {
				System.out.println("맞았습니다.");
				System.out.print("게임을 종료하시겠습니까?(y/n) >>");
				String yes_or_no = sc.nextLine();
				if (yes_or_no.equals("y")) {
					System.out.println("================================");
					System.out.println("\t[숫자맞추기게임 종료]");
					System.out.println("================================");
					break;
				} else if (yes_or_no.equals("n")) {
					System.out.println("게임이 다시 시작됩니다.");
					dap = (int)(Math.random()*100)+1;
				}

			} else if (num > dap) {
				System.out.println("더 낮게");
			} else if (num < dap) {
				System.out.println("더 높게");
			}

		}

		sc.close();

	}

}
