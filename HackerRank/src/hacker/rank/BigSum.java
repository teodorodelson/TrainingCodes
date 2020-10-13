package hacker.rank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class BigSum {
	 // Problem link
	 // https://www.hackerrank.com/challenges/a-very-big-sum/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
	 // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
        long sum = 0l;
        for(long abc : ar){
            sum = sum + abc;
        
        }return sum;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long[] ar = new long[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            long arItem = Long.parseLong(arItems[i]);
            ar[i] = arItem;
        }

        long result = aVeryBigSum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

/**
 * 
 * 
 *     static int hourglassSum(int[][] arr) {
        List<Integer> something = new ArrayList<Integer>();
        
        for(int s = 0; s <4; s++){
        for (int x = 0 ;  x <4 ; x++){
            int sum = 0;
            int counter =0;
            int midCounter = 0;
            for(int row = 0 +s; row < 3 +s; row++){      
                for(int col = 0 +x; col <3 +x ; col++){
                    if(col == 0 +x){
                        sum = sum + arr[row][col];
                        System.out.println(sum);
                    }else if(col == 1 + x){
                       // System.out.println("mid" + midCounter);
                            sum = sum + arr[row][col];   
                             System.out.println(sum);
                    
                    }else if(col == 2 +x){
                        sum = sum + arr[row][col];
                            System.out.println(sum);
                            System.out.println("Coutner " + ++counter);
                        
                        if(counter == 3){
                            something.add(sum);
                            for(Integer a: something){
                                System.out.println("This is max" +a);
                            }
                        }
                    }
                }
            }
        }
    }
 */

/**
 * 
 * static int hourglassSum(int[][] arr) {
        int sum =Integer.MIN_VALUE;
     for(int i =0; i<4; i++){
        for(int j=0; j<4; j++){
           int temp = arr[i][j] + arr[i][j+1] +arr[i][j+2] +arr[i+1][j+1]
                     +arr[i+2][j] +arr[i+2][j+1] + arr[i+2][j+2];
            if(temp>sum){
                sum = temp;
            }
        }
   

    } return sum;
    }

 * 
 */




   
