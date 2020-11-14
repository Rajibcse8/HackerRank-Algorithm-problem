import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    

    public static int diagonalDifference(List<List<Integer>> arr) {
    
     
      int sum1=0;
      int sum2=0;
      
      int l1=0;
      int l2=arr.size()-1;
      
        System.out.println(l1);
        
        for(int row=0;row<arr.size();row++){
        
               for(int col=0;col<arr.size();col++){
               
                   
                   if(row==col){
                      sum1=sum1+arr.get(row).get(col);
                   }
                   
                   if(row==l1 & col==l2){
                     
                       sum2=sum2+arr.get(l1).get(l2);
                       l2--;
                       l1++;
                   }
               }        
        }
        
        int res=Math.abs(sum1-sum2);

      return res;



    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        int result = Result.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
