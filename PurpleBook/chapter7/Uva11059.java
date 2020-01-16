import java.util.Scanner;
public class Uva11059 {

	
	public static void main(String[]args) {
		
		int S[] = new int [20];
		int kase = 0;
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			
			int n = scanner.nextInt();
			for(int i = 0; i < n; i++) {
				S[i] = scanner.nextInt();
			}
			
			long ans = 0;
			
			for( int i = 0; i <n; i++) {
				long v = 1;
				
				for(int j = i; j < n; j++) {
					
					v*=S[j];
					if(v > ans) ans =v;
				}
			}
			kase++;
			System.out.println("Case #"+kase+": The maximum product is "+ans+".");
		}
	}
}
