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
        String x,y;
        
        x=scan.nextLine();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        y=scan.next();
       
        String[] xy=x.split(" ");
        
       int[] arr=new int[xy.length];
        for(int i=0;i<xy.length;i++){
            int data=Integer.parseInt(xy[i]);
            arr[i]=data;
        
        }
        
        int max=0;
        for(int i=0;i<y.length();i++){
           
             Character val=y.charAt(i);
             int index=val-97;
              if(arr[index]>max){
                max=arr[index];
              }  
        }
        System.out.println(max*y.length());
        
           
    }}
