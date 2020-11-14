import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    
    static int simpleArraySum(int[] ar) {

         int sum=0;
         for(int i=0;i<ar.length;i++){

             sum=sum+ar[i];
         }

         return sum;    

    }

   

    public static void main(String[] args){

         Scanner scan =new Scanner(System.in);
        int n;
        n=scan.nextInt();

         int[] arra=new int[n];

         for(int i=0;i<n;i++){
            
            arra[i]=scan.nextInt();
         } 
      System.out.println(simpleArraySum(arra));
    }
}
