package com.infosys.practice;

import java.util.LinkedList;
import java.util.List;

/**
 * This program demonstrates (1) how to add an element into a Linkedlist. (2)
 * how to get the second to the last element.
 * 
 * @author Teodoro Delson Jr.
 *
 */

public class BasicLinkCode {

	public static void main(String[] args) {

		List<Integer> numbers = new LinkedList<Integer>();
		numbers.add(100);
		numbers.add(500);
		numbers.add(323);
		numbers.add(515);
		numbers.add(231);
		numbers.add(531);
		numbers.add(312);
		System.out.println("Number of elements in list before adding one more: " + numbers.size()); // displays how many elements in linked list
		numbers.add(numbers.size() - 1, 214); // adding an element 2nd to the last element.
		numbers.remove(2); // removes number at index 2
		System.out.println("Index of number 214 is " + numbers.indexOf(214)); // displays the index of number 214 from the list

		// displays all the current elements of the list.
		for (int output : numbers) {
			System.out.print(output + " ");
		}
	}

}
