package com.fju.mid;

import java.util.Random;

public class DiceRoller {

	public static void main(String[] args) {
		for (int b = 1; b > 0; b++) {
			for (int a = 1; a <= 3; a++) {
				Random r = new Random();
				int n1 = r.nextInt(10) + 1;
				System.out.print(" " + n1);
				}
				System.out.println();
				if(n1 == n1){
					break;
				}
			}
		System.out.println("1點出現"+k1+"次");
		System.out.println("2點出現"+k2+"次");
		System.out.println("3點出現"+k3+"次");
		System.out.println("4點出現"+k4+"次");
		System.out.println("5點出現"+k5+"次");
		System.out.println("6點出現"+k6+"次");
		}
}

