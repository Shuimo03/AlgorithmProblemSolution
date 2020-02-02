import java.util.Scanner;

public class Power_Operations_Of_Cattle {

	static final long magic = 1000000007;
	
	public static int gcd(int a,int b) {
		return b == 0 ? a:gcd(b,a%b);
	}
	
	
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			
			int n = scanner.nextInt();
			long cnt = n*n+n*(n-1);
			for(int i  = 30; i>1;i--) {
				int y = (int)Math.pow(n+0.5, 1.0/i);
				long tmp = (y-1)*(n/i)*2;
				for(int j = i-1; j>=1; j--) {
						if(gcd(i,j)==1) {
							cnt += tmp;
						}
					}	
				}
			System.out.println(cnt % magic);
		}
	}
}
