import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static Scanner scan  = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n,k,q;
        n=scan.nextInt();
        k=scan.nextInt();
        q=scan.nextInt();
        int[] arra=new int[n];
        for(int i=0;i<n;i++){
          arra[(i+k)%n]=scan.nextInt();
        }
        
        for(int i=0;i<q;i++){
            System.out.println(arra[scan.nextInt()]);
        }
}
    
}
