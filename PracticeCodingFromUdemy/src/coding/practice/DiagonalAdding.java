package coding.practice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class DiagonalAdding {

	
		//https://www.hackerrank.com/challenges/diagonal-difference/problem
	

	    /*
	     * Complete the 'diagonalDifference' function below.
	     *
	     * The function is expected to return an INTEGER.
	     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
	     */

	    public static int diagonalDifference(List<List<Integer>> arr) {
	    // Write your code here

	    int sum =0;
	    int sum2=0;
	    int counter= 0;
	    int counter2= arr.size() -1;
	   for(int row= 0; row < arr.size(); row ++ ){
	           int temp = arr.get(row).get(counter);
	           sum += temp;
	           counter++;
	    
	   }

	     for(int row = 0; row < arr.size(); row++){
	           int temp = arr.get(row).get(counter2);
	           sum2 += temp;
	           counter2--;
	       }

	       System.out.println(sum +" " + sum2);
	    int total =0;
	    // row 0 col 0 = 11
	    // row 1 col 0 
	    //System.out.println(arr.size());
	    //System.out.println(arr.toString());
	    if(sum > sum2)
	        total = sum - sum2;
	    else
	        total = sum2 - sum;
	        
	    return total;

	    }

	
	
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int n = Integer.parseInt(bufferedReader.readLine().trim());

	        List<List<Integer>> arr = new ArrayList<>();

	        IntStream.range(0, n).forEach(i -> {
	            try {
	                arr.add(
	                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	                        .map(Integer::parseInt)
	                        .collect(toList())
	                );
	            } catch (IOException ex) {
	                throw new RuntimeException(ex);
	            }
	        });

	        int result = DiagonalAdding.diagonalDifference(arr);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
	}


