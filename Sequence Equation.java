import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
     
 

    public static void main(String [] args) {
    
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arra = new int[n + 1];
        for (int x = 1; x <= n; x++) {
            int px = scan.nextInt();
            arra[px] = x;
        }
        scan.close();
        
       
        for (int x = 1; x <= n; x++) {
            int y = arra[arra[x]];
            System.out.println(y);
        }
     
    }}
