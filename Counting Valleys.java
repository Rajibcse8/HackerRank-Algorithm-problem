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
        
        String s=scan.next();
        int pair=1;
        int count=0;
        for(int i=0;i<n;i++){
        
            if(s.charAt(i)=='D' )
            {
            
                pair=pair-1;
             }
             
             if(s.charAt(i)=='U' )
            {
                 if(pair==0){
                      count++;
                      pair++;
                 }
                 else{
                    
                     pair++;
                 }
               
             }
            
            }
        System.out.println(count);
          
        }
    
    
     
        } 

  
