package com.infosys.practice;

/**
 * This program removes white spaces in between words.
 * 
 * @author Teodoro Delson Jr.
 *
 */
public class RemoveSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Solution 1 using replace method of String
		String sample = "This is a String";

		sample = sample.replaceAll(" ", "");
		System.out.println(sample);

		// Solution 2: Without using replace method

		char[] sample2 = sample.toCharArray();

		for (char bb : sample2) {
			if (bb != ' ') {
				System.out.print(bb);
			}
		}
	}

}
