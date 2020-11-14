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
        int n;
        n=scan.nextInt();
        
        int [] arr= new int[n];
        
        
        for(int i=0;i<n;i++){
             arr[i]=scan.nextInt();
        }
        Arrays.sort(arr);
        
      int pair=0;
     
      for(int i=0;i<arr.length-1;i++){
          
          if(i==0){
           
             if(arr[i]==arr[i+1]){
                     pair++;
                     i=i+1;
                     continue;
             }
          }
          if(arr[i]==arr[i+1]){
             pair++;
            i=i+1;
          }
          if(i==n-1)break;
               
      }
        System.out.println(pair);
        
        
       
    }    
        } 
  
