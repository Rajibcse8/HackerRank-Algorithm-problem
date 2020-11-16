import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    
    public static int find(int n,int m,int s){
     
        int c=m%n;
        int res=c+s-1;
        if(res>n){
          res=res-n;
           return res;
        }
        if (res==0){
           return n;
        }
        
    return res;
    }
     
 static Scanner scan =new Scanner (System.in);
    
    public static void main(String [] args) {
        int t;
        
        t=scan.nextInt();
        
        for(int i=0;i<t;i++){
        
            int n,m,s;
            
            n=scan.nextInt();
            m=scan.nextInt();
            s=scan.nextInt();
            
            int res=find(n,m,s);
            System.out.println(res);
            
        }
        scan.close();
 
}
}
