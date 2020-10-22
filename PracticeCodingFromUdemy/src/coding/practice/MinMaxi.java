package coding.practice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class MinMaxi {

	//https://www.hackerrank.com/challenges/mini-max-sum/problem

	    // Complete the miniMaxSum function below.
	    static void miniMaxSum(int[] arr) {
	       ArrayList<Long> numarr =  new ArrayList<>();

	       for(long a: arr){
	           numarr.add(a);
	       }

	        Collections.sort(numarr);
	        long maxi = numarr.get(1)+ numarr.get(2) + numarr.get(3)+ numarr.get(4);
	        long low = numarr.get(0)+numarr.get(1)+numarr.get(2)+numarr.get(3);
	       
	        System.out.println(low +" "+ maxi);
	        
	            
	        

	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int[] arr = new int[5];

	        String[] arrItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < 5; i++) {
	            int arrItem = Integer.parseInt(arrItems[i]);
	            arr[i] = arrItem;
	        }

	        miniMaxSum(arr);

	        scanner.close();
	    }
	}


