import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

     
 static Scanner scan =new Scanner (System.in);
    
    public static void main(String [] args) {
        int t;
        t=scan.nextInt();
        int max=0;
       
        for(int i=0;i<t;i++){
                
           String S=scan.next();
           int N=Integer.parseInt(S);
           char[] ch=S.toCharArray();
           int count=0;
           for(char c :ch){
               int div=Integer.parseInt(String.valueOf(c));
               if(div!=0){
               
                    if(N%div==0)count++;
                    continue;
               }
           }                   
       
            System.out.println(count);
             
        } 
     }}
