import java.util.Scanner;

public class GcdAndLcm {
	
	/**
	 * 
	 *最大公约数
	 */
	static long gcd(long a, long b) {
		return b ==0 ? a:gcd(b,a%b);
	}
	
	/**
	 * 最小公倍数
	 * 
	 */
	static long lcm(long a, long b) {
		 return a / gcd(a, b) * b;
	}
	
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			
			long m = scanner.nextLong();
			long n = scanner.nextLong();
			System.out.println(gcd(m,n)+" "+lcm(m,n));
			
		}
	}
}
