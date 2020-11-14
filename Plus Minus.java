import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
   
        
        double pl=0;
        double mi=0;
        double ze=0;
        for(int data :arr){
        
          if(data>0){
           
            pl++;
          }
          else if(data<0){
           
            mi++;
          }
          else{
                  ze++;
                  }
           
        }
        
        DecimalFormat df = new DecimalFormat();
       df.setMinimumFractionDigits(6);
       
      System.out.println(pl==0 ?"0.000000": df.format((double)pl/(double)arr.length) );
      System.out.println(mi==0 ?"0.000000": df.format((double)mi/(double)arr.length) );
      System.out.println(ze==0 ?"0.000000": df.format((double)ze/(double)arr.length) );

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
