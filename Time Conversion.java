import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
               String S="";
        String First="";
        String result="";
           
           int size=s.length();
           S=S+s.charAt(size-2)+s.charAt(size-1);
           S=S.toUpperCase();
           First=First+s.charAt(0)+s.charAt(1);
                      
           s=s.substring(0, size-2);
               
           
           if(S.equals("PM")){
              
              int i=Integer.parseInt(First);
           
                 if(i!=12){
               i=i+12;
           }
           
           if(i==12){
              i=i;
           }   
                          
              result=String.valueOf(i);   
               
           
           }
           if(S.equals("AM")){
             
               if(First.equals("12"))
                   result="00";
               
               else result=First;
           }
           
        
          for(int i=2;i<s.length();i++){
          
            result=result+s.charAt(i);
          }
             
       
             return result;
    }
    

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
