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
        int year;
        year=scan.nextInt();
        
        if(year==1918){
            System.out.println("26.09."+year);
          return;  
        }
    if( (year<1917 && year %4==0)  ||( year%400==0) ||( year %100!=0  && year%4==0  )    )
        {
           
            System.out.println("12.09."+year);
        }
        else{
                System.out.println("13.09."+year);
           }
        
     
     
        } 
}
  
