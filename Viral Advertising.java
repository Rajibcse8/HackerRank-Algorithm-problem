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
        int n ;
        n=scan.nextInt();
        int count=2;
        int ans=2;
      for(int i=2;i<=n;i++){
         int res=count*3;
         double c = (double)res;
          c=Math.floor(c/2);
          count=(int)c;
          ans=ans+count;    
      }
      System.out.println(ans);
    }
}
