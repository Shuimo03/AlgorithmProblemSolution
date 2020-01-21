import java.util.Scanner;

public class The_Gcd_Of_Coprime {

	static long gcd(long a, long b) {
		return b == 0 ? a:gcd(b,a%b);
	}
	
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNext()) {
			
			long m = scanner.nextLong();
			long n = scanner.nextLong();
			
			if(gcd(m,n) == 1) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
	}
}
