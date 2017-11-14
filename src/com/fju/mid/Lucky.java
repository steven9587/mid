package com.fju.mid;

import java.util.Random;
import java.util.Scanner;

public class Lucky {

	public static void main(String[] args) {
		System.out.println("請輸入一個1到10之間的幸運數字:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int number = Integer.parseInt(line);

		for (int a = 1; a <= 6; a++) {
			Random r = new Random();
			int n1 = r.nextInt(10) + 1;
			System.out.print(" " + n1);
			if (number == n1) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}

		}
	}
}
