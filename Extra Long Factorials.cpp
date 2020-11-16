import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {
    public static Scanner scan  = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = scan.nextInt();
        BigInteger ans = new BigInteger("1");
        for(int i=1;i<=n;i++){
          ans=ans.multiply(BigInteger.valueOf(i));
        }
        System.out.println(ans);
    }
}
