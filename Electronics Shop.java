import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
        
    static void  findmax(int b,int[] arr1,int[] arr2){
    
       boolean flag=false;
         int sum=0;
         
         for(int i=0;i<arr1.length;i++){
         
             for(int j=0;j<arr2.length;j++){
             
                  if(arr1[i]+arr2[j]<=b){
                    flag=true;
                      
                    if(arr1[i]+arr2[j]>sum){
                       sum=arr1[i]+arr2[j];
                    }
                  }
                 
             }
         }
         
         if(flag==false)System.out.println("-1");
         else System.out.println(sum);
       
        
    }
    
     
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) 
    {
        int b,n,m;
        b=scan.nextInt();
        n=scan.nextInt();
        m=scan.nextInt();
      scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        int[] arr1= new int[n];
        int[] arr2= new int[m];
       
        for(int i=0;i<n;i++){
            arr1[i]=scan.nextInt();
          scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?"); 
           }
              for(int i=0;i<m;i++){
            arr2[i]=scan.nextInt();
          scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?"); 
           }
          findmax(b,arr1,arr2);
          scan.close();        
        }
        
    }
