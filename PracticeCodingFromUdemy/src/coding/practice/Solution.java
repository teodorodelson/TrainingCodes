package coding.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {
	private static Scanner kbd = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem: Create a method that will accept an input to create an array
		// use the array to get the minimum value
		
	System.out.println("minimum value: "+findMin(readIntegers(4)));
	
	
		
	}
	
	public static int[] readIntegers(int count) {
		
		int[] intArray= new int[count];
		System.out.println("Enter "+count+" numbers: ");
		for(int i = 0; i < count; i++) {
			intArray[i] = kbd.nextInt();
			
			System.out.println("You entered : " + intArray[i]);
		}
		return intArray;
	}

	public static int findMin(int[] meow) {
		
		List<Integer> intList = new ArrayList<Integer>();
		int result =0 ;
			for(Integer x: meow) {
				intList.add(x);
			}
			Collections.sort(intList);
			result = intList.get(0);
			
		return result;
	}

}
