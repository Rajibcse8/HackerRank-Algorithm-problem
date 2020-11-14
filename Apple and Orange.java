    import java.io. *;
import java.math. *;
import java.security. *;
import java.text. *;
import java.util. *;
import java.util.concurrent. *;
import java.util.regex. *;

public class Solution {

    
    static void countApplesAndOranges (int s, int t, int a, int b, int [] apples, int [] oranges) {


              int count1 = 0, count2 = 0;
        int dis;
        for (int i = 0; i <apples.length; i ++) {
              
            dis = apples [i] + a;
            
            if (dis> = s && dis <= t) {
               count1 ++;
            }
            }
        for (int i = 0; i <oranges.length; i ++) {
              
            dis = oranges [i] + b;
            
            if (dis> = s && dis <= t) {
               count2 ++;
            }
            }
        
        System.out.println (count1 + "\ n" + count2);

    }

    private static final Scanner scanner = new Scanner (System.in);

    public static void main (String [] args) {
        String [] st = scanner.nextLine (). Split ("");

        int s = Integer.parseInt (st [0]);

        int t = Integer.parseInt (st [1]);

        String [] ab = scanner.nextLine (). Split ("");

        int a = Integer.parseInt (from [0]);

        int b = Integer.parseInt (ab [1]);

        String [] mn = scanner.nextLine (). Split ("");

        int m = Integer.parseInt (mn [0]);

        int n = Integer.parseInt (mn [1]);

        int [] apples = new int [m];

        String [] applesItems = scanner.nextLine (). Split ("");
        scanner.skip ("(\ r \ n | [\ n \ r \ u2028 \ u2029 \ u0085])?");

        for (int i = 0; i <m; i ++) {
            int applesItem = Integer.parseInt (applesItems [i]);
            apples [i] = applesItem;
        }

        int [] oranges = new int [n];

        String [] orangesItems = scanner.nextLine (). Split ("");
        scanner.skip ("(\ r \ n | [\ n \ r \ u2028 \ u2029 \ u0085])?");

        for (int i = 0; i <n; i ++) {
            int orangesItem = Integer.parseInt (orangesItems [i]);
            oranges [i] = orangesItem;
        }

        countApplesAndOranges (s, t, a, b, apples, oranges);

        scanner.close ();
    }
}
