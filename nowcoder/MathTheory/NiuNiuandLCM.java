
import java.util.Scanner;


public class NiuNiuandLCM {

	 static int gcd(int a, int b) {
		return b == 0 ? a:gcd(b,a%b);
	}
	
	 static int lcm(int a, int b) {
		 return a / gcd(a, b) * b;
	}
	
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
			int n = scanner.nextInt();
			int arr[] = new int[n];
			for(int i = 0; i < n; i++) {
				arr[i] = scanner.nextInt();
			}
			
			int x = scanner.nextInt();
			int LcmNum = 1;
			
			for(int i = 0; i < n; i++) {
				if(x % arr[i] == 0) {
					LcmNum = lcm(LcmNum,arr[i]);
				}
			}
			if(LcmNum == x) {
				System.out.println("Possible");
			}
			else {
				System.out.println("Impossible");
			}
		}
}
