package com.Exercise;

import java.util.Scanner;
import java.util.Random;

public class RandomNumGame {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int c = 1;
		for (int i = 1; i <= 3; i++) {
			int random = r.nextInt(1, 11);
			System.out.println("Enter value between 1 to 10 for challenge ");
			int a = sc.nextInt();
			if (random == a) {
				System.out.println("You win");
				break;
			} else {
				c++;
				if (c <= 3) {
					System.out.println("You loss a chance");
				} else {
					System.out.println("you lost the game");
					System.out.println("The random value is :" + random);
				}
			}
		}
		sc.close();
	}
}
