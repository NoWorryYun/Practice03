package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int dan2 = 1; dan2 <= 9; dan2++) {
			for (int dan = 2; dan <= 9; dan++) {
				System.out.print(dan + "*" + dan2 + "*" + (dan * dan2) + "\t");
			}
			System.out.println("");
		}
	}

}
