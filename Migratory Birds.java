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
        
     
        int value=arr[0];
        int count=0;
        int max=0;
        int maxvalue = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==value){
               count++;
               
             if(count>max){
             
                 max=count;
                 maxvalue=arr[i];
             }
            
            
            }
            
            
            else{
                
                
                count=1;
                
                value=arr[i];
                
             
                
             }
        
        }
        
        System.out.println(maxvalue);
        
        
       
    }    
        } 
  
