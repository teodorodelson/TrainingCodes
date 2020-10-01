package com.infosys.practice;

/**
 * This program gives multiple solutions on how to reverse a string given
 * 
 * @author Teodoro Delson Jr.
 *
 */

public class StringReverse {

	public static void main(String[] args) {
		// Solution 1:
		// Reverse the string by converting the String into an array of characters

		String sample = "Iwilldomybest";
		System.out.println("Original String: " + sample);
		char[] abc = sample.toCharArray();

		// Start with the very last element of the array and print.
		System.out.println("Solution 1");
		for (int i = abc.length - 1; i >= 0; i--) {
			System.out.print(abc[i]);
		}
		System.out.println();

		// Solution2
		// Taking the string given and create a String builder. Use the method reverse.
		System.out.println("Solution 2");
		StringBuilder sample2 = new StringBuilder(sample);
		System.out.println(sample2.reverse());

	}
}