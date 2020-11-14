import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
       
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) 
    {
        int n,k;
        n=scan.nextInt();
        k=scan.nextInt();
      scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        int[] arr= new int[n];
        
        int sum=0;
        for(int i=0;i<n;i++){
            
            arr[i]=scan.nextInt();
          scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?"); 
           if(i!=k){
               sum=sum+arr[i];
           }
        }
        sum=sum/2;
        int bill=scan.nextInt();
        if(bill-sum>0)System.out.println(bill-sum);
        else System.out.println("Bon Appetit");
        
        
    }
}
