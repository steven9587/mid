package com.fju.mid;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		System.out.println("Please enter a number:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int number = Integer.parseInt(line);
		for (int a = 1; a <= number; a++) {
			System.out.print(a + " ");
		}
	}

}
