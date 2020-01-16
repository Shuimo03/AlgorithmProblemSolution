
import java.util.Scanner;
import java.util.Arrays;
public class Uva725 {


	static int arr[] = new int[10];
	
	static boolean judge(int a, int b) {
		Arrays.fill(arr, 0);
		if(b > 98765) return false;
		for( int i = 0; i < 5; i++) {
			arr[a % 10]++;
			arr[b % 10]++;
			a /= 10;
			b /= 10;
		}
		
		for(int i = 0; i < 10; i++) {
			if(arr[i] != 1) return false;
		}
		return true;
	}
	
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		int kase = 1;
		while(scanner.hasNext()) {
			int n = scanner.nextInt();
			if(n == 0) break;
			boolean flag = false;
			if(kase == 1) {
				kase = 2;
			}
			else {
				System.out.println();
			}
			for(int i = 1234; i < 99999; i++) {
				if(judge(i,n*i)) {
					System.out.printf("%05d / %05d = %d\n",n*i,i,n);
					flag = true;
				}
			}
			
			if(flag == false) {
				System.out.printf("There are no solutions for %d.\n",n);
			}
		}
	}
}
