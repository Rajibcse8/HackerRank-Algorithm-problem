import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

 class Result {

    
    public static int[] gradingStudents(int [] grades) {
  
         for(int i=0;i<grades.length;i++)
        {
          if(grades[i]>=38)
          {
               if(grades[i]+(5-grades[i]%5)-grades[i]<3)
               grades[i]=(grades[i]+(5-grades[i]%5));
               
          } 
        }
        return grades;


}

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

 

         int[] grades=new int[gradesCount];
         
        for (int i = 0; i < gradesCount; i++) {
            int gradesItem = Integer.parseInt(bufferedReader.readLine().trim());
            grades[i]=gradesItem;
        }

       int[] result = Result.gradingStudents(grades);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
