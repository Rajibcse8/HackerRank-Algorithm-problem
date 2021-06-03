import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Rajib {
 
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tn = Integer.parseInt(in.readLine());
		
		for(int tc = 0; tc < tn; tc++) {
			int n = Integer.parseInt(in.readLine());
			String a = in.readLine();
			String b = in.readLine();
			
			if(a.equals(b)) {
				System.out.println("YES");
				continue;
			}
			
			int[] preA = new int[n+1];
			int[] preB = new int[n+1];
			
			for(int i = 0; i < n; i++) {
				preA[i+1] = preA[i]+ (a.charAt(i)-'0');
				preB[i+1] = preB[i]+ (b.charAt(i)-'0');
			}
			
			
			boolean works = true;
			boolean flip = false;
			
			for(int i = n-1; i >= 0; i--) {
				int j = i;
				while(j >= 0 && ((!flip && a.charAt(j) != b.charAt(j)) || (flip && a.charAt(j)==b.charAt(j)))) {
					j--;
				}
				
				if(j < i) {
					if(2*preA[i+1] != (i+1)) {
						works = false;
						break;
					} else {
						i=j+1;
						flip = !flip;
					}
				}
			}
			
			if(works) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
 
}
