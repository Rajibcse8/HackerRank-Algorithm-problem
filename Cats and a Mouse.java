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
        int q;
        q=scan.nextInt();
        
        int x,y,z;
        for(int i=0;i<q;i++){
        
        x=scan.nextInt();
        y=scan.nextInt();
        z=scan.nextInt();
       
        int res1=Math.abs(x-z);
        int res2=Math.abs(y-z);
        
        if(res1>res2)System.out.println("Cat B");
        
        else if(res1<res2)System.out.println("Cat A");
        else System.out.println("Mouse C");
    }}}
