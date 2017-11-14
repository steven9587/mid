package com.fju.mid;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		System.out.println("Please enter a number:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int number = Integer.parseInt(line);
		for (int a = 1; a <= number; a++) {
			if(a>10){
				break;
			}
			if(a%5 ==0){
				System.out.print("#"+" "+a+ " ");
			}else{
				System.out.print(a + " ");
			}
		}
	}

}
