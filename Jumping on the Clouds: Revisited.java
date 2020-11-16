import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static Scanner scan  = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = scan.nextInt();
        int k =scan.nextInt();
        int[] arra= new int[n];
        
        for(int i=0;i<n;i++){
          arra[i]=scan.nextInt();
        }
        boolean flag=true;
        int i=0;
        int sum=0;     
        while(flag!=false){
            
            i=(i+k)%n;
            
            if(arra[i]==0)sum+=1;
            if(arra[i]==1)sum+=3;
            
            if(i==0){
             
              flag=false;
              continue;
            }  
        }
        System.out.println(100-sum);
}
    
}
