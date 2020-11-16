import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    
    public static int find(int data){
        
        int res=1;
        for(int i=1;i<=data;i++){
             if(i%2==1){
               res=res*2;
             }
            if(i%2==0){
               res=res+1;
             }
        }
        
        return res;
    }
 
 static Scanner scan =new Scanner (System.in);
    
    public static void main(String [] args) {
        int n ;
        n=scan.nextInt();
        
         for(int i=1;i<=n;i++){
         
             int data=scan.nextInt();
             
             int res=find(data);
             System.out.println(res);
         }
               
}
}
