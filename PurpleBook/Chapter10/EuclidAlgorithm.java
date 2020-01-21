public class EuclidAlgorithm {

	
	static int k = 10000;
	
	static int gcd(int a, int b) {
		
		return b == 0 ? a:gcd(b,a%b);
	}
	
	static boolean judge(int X[]) {
		X[2] /= gcd(X[2],X[1]);
		for(int i = 3; i <= k; i++) {
				X[2] /= gcd(X[i],X[2]);
		}
		return X[2] == 1;
	}
	
}
