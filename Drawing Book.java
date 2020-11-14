import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
        
    static int find1s(int p){
        
        if(p%2==0)p=p+1;
        
        int res=(p-1)/2;
 
     return res;
    }
    
    
    static int find2nd(int n,int p){
    
     if(n%2!=0)n=n-1;
     if(p%2!=0)p=p-1;
     
     
     int res=(n-p)/2;
    
    return res;
    }
     
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) 
    {
        int n,p;
        
      n=scan.nextInt();
      p=scan.nextInt();
      
      int first=find1s(p);
      int sec=find2nd(n,p);
      
      if(first<sec)System.out.println(first);
      else System.out.println(sec);
       
        
    }}
