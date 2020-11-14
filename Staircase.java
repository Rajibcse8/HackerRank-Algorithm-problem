import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void staircase(int n) {
          
        int count=6;
        int star=1;
        
        String S="";
             for(int i=1;i<=n;i++){
             
                S= printpar(n,i);
                 System.out.println(S);
                 S="";     
             }
               

    }

  static  String printpar(int n ,int i){
    String S="";
           for(int j=1;j<=n;j++){
               if(j<=n-i){
                S=S+" "; 
               }
               else{
                 
                   S=S+"#";
               }
             
               
           
           }
           
    return S;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
