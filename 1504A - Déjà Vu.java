
import java.util.Scanner;
 
public class Rajib {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            dejavu(scanner.next());
        }
    }
 
    public static void dejavu(String s) {
        boolean all = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'a') {
                print("YES");
                StringBuilder sb = new StringBuilder(s);
                sb.insert(s.length() - i, 'a');
                print(sb.toString());
                return;
            }
        }
        print("NO");
    }
 
    public static void print(Object o) {
        System.out.println(o);
    }
}
