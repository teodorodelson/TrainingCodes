package com.infosys.practice;

/**
 * This program counts the number of duplicates in a given String.
 * 
 * @author Teodoro Delson Jr.
 *
 */
import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates {

	public static void main(String[] args) {

		String given = "abaabbaaccccaabbbc";

		char[] given2 = given.toCharArray();

		Map<Integer, Character> map = new HashMap<>();
		int b = 0;
		for (int i = 0; i < given2.length; i++) {

			b = b + 1;
			map.put(b, given2[i]);
//			System.out.println(map.values());  //Displays all the values in map
		}

		int counterA = 0;
		int counterB = 0;
		int counterC = 0;
		for (Integer x : map.keySet()) {
			if (map.get(x) == 'a') {
				counterA++;
			} else if (map.get(x) == 'b') {
				counterB++;
			} else if (map.get(x) == 'c') {
				counterC++;
			}

		}
		// Print out the values.
		System.out.println("A count:" + counterA);
		System.out.println("A count:" + counterB);
		System.out.println("A count:" + counterC);

	}

}
