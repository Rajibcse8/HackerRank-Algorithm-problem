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
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
         arr[i]=scan.nextInt();
    
    }
     Arrays.sort(arr);
      
    int count=0;
    int max=0;
    int val;
    int data=arr[0];
    for(int i=0;i<arr.length;i++){
           
         val=Math.abs(data-arr[i]);
          
         if(val<=1){
            count++;
            if(count>max){
               max=count;
               continue;
            }
         }
         
         else if(val>1){
             data=arr[i];
             count=1;
             if(count>max)
                 max=count;
         }
         
        }
    
        System.out.println(max);     
    }
                 
    }
