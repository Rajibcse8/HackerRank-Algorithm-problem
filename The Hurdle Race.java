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
        
    int n,k;
    n=scan.nextInt();
    k=scan.nextInt();
    int max=0;
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
         arr[i]=scan.nextInt();
         if(arr[i]>max)max=arr[i];
    
    }
    if(max-k>0)System.out.println(max-k);
    else System.out.println("0");
     }}
