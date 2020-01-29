import java.util.Scanner;
import java.util.Arrays;
public class SquareDetection {
/**
 *    抄了 一袖一曲一成名大佬的
 * @param args
 */
	public static void main(String []args) {
		

		Scanner scanner = new Scanner(System.in);
		int x[] = new int[4];
		int y[] = new int[4];
		for(int i = 0; i <4; i++) {
			x[i] = scanner.nextInt();
		}
		
		for(int i = 0; i <4; i++) {
			y[i] = scanner.nextInt();
		}
		
		double arr[] = new double[3];
		arr[0] = Math.sqrt(Math.pow(x[0]-x[1],2)+Math.pow(y[0]-y[1], 2));
		arr[1] = Math.sqrt(Math.pow(x[0]-x[2],2)+Math.pow(y[0]-y[2], 2));
		arr[2] = Math.sqrt(Math.pow(x[0]-x[3],2)+Math.pow(y[0]-y[3], 2));
		
		Arrays.sort(arr);
		boolean flag = false;
		
		for(int i = 1; i < 4; i++) {
			double arr1[] = new double[3];
			for(int j = 0,k = 0; j < 4; j++) {
				if(i != j) {
					arr1[k++] = Math.sqrt(Math.pow(x[i]-x[j],2)+Math.pow(y[i]-y[j], 2));
				}
			}
			Arrays.sort(arr1);
			if(arr[0]==arr1[0] && arr[1]==arr1[1] && arr[2]==arr1[2] && arr[0]==arr1[1]) {
				continue;
			}
			else {
				flag = true;
				break;
			}
		}
		if(flag == true) {
			System.out.println("Not a square");
		}
		else {
			 System.out.println("It's a square");
		}
	}
}
