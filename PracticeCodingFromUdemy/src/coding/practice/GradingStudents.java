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

public class GradingStudents {
	


	    /*
	     * Complete the 'gradingStudents' function below.
	     *
	     * The function is expected to return an INTEGER_ARRAY.
	     * The function accepts INTEGER_ARRAY grades as parameter.
	     */

	    public static List<Integer> gradingStudents(List<Integer> grades) {
	    // Write your code here
	    List<Integer> grado = new ArrayList<Integer>();
	    for(Integer a : grades){
	        if (a < 38){
	            grado.add(a);
	        }else if((a % 5) == 3){
	            int newGrade =a + 2;
	            grado.add(newGrade);
	        }else if((a % 5) == 4){
	            int newGrade =a + 1;
	            grado.add(newGrade);
	        }else{
	            grado.add(a);
	        }
	    }
	    return grado;

	    }

	}

	 class Solution {
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

	        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
	            try {
	                return bufferedReader.readLine().replaceAll("\\s+$", "");
	            } catch (IOException ex) {
	                throw new RuntimeException(ex);
	            }
	        })
	            .map(String::trim)
	            .map(Integer::parseInt)
	            .collect(toList());

	        List<Integer> result = GradingStudents.gradingStudents(grades);

	        bufferedWriter.write(
	            result.stream()
	                .map(Object::toString)
	                .collect(joining("\n"))
	            + "\n"
	        );

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
	}


