package com.infosys.javacorepractice;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * Problem indicated below
 * @author Teodoro Delson Jr
 *
 */
public class DecimalComparator {


	public static void main(String[] args) {
		
		areEqualsByThreeDecimalPlaces(3.1755, 3.1756);
		
		
		
	}
	
	public static boolean areEqualsByThreeDecimalPlaces(double umX, double umY) {
		DecimalFormat df = new DecimalFormat("###.###");
		df.setRoundingMode(RoundingMode.DOWN);

		String ewumX= df.format(umX);
		String ewumY = df.format(umY);
		System.out.println(df.format(umX));
		System.out.println(ewumY);
		
		if(ewumX.equals(ewumY)) {
			System.out.println("try");
			return true;
		}else {
			System.out.println("false");
		return false;
	}
	}

}

/**
 * 
 * Write a method areEqualByThreeDecimalPlaces with two parameters of type double.

The method should return boolean ad it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.


EXAMPLES OF IPUT/OUTPUT:

* areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since numbers are equal up to 3 decimal places.

* areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since numbers are not equal up to 3 decimal places

* areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true since numbers are equal up to 3 decimal places.

* areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false since numbers are not equal up to 3 decimal places.


TIP: Use paper ad pencil.

TIP: Use casting.

OTE: The areEqualByThreeDecimalPlaces method  needs to be defied as public static like we have bee doing so far i the course.
OTE: Do not add a  main method to solution code.
 */
