package com.infosys.practice;

import java.util.Scanner;

/**
 * This program tells whether a number is odd or even. Added user input and
 * simple validation.
 * 
 * @author Teodoro Delson Jr.
 *
 */
public class OddEven {

	public static void main(String[] args) {
		// Solution 1 using a modulo operator %
		int num;

		Scanner kbd = new Scanner(System.in);

		System.out.print("Please enter a non-negative number: ");
		num = kbd.nextInt();

		// Validation
		while (num < 0) {
			System.out.print("Try again! Please enter a non-negative number: ");
			num = kbd.nextInt();
		}

		// Actual code for solution 1
		if (num % 2 == 0) {
			System.out.println(num + " is an even number.");
			kbd.close();
		} else {
			System.out.println(num + " is an odd number.");
			kbd.close();
		}

		// Solution 2 without using %

		boolean checker = true;

		for (int i = 1; i <= num; i++) {
			checker = !checker;
		}

		if (checker == true) {
			System.out.println(num + " is an even number");
		} else {
			System.out.println(num + " is an odd number");
		}
	}

}
