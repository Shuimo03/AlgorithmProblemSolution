import java.util.Scanner;
public class HDOJ2008{
	
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			
			int n = scanner.nextInt();
            if(n == 0){
                break;
            }
            else {
                double arr[] = new double[n];
                for(int i = 0; i < n; i++) {
                    arr[i] = scanner.nextDouble();
                }
                int negative = 0;
                int positive = 0;
                int zero  = 0;
                for(int i = 0; i < arr.length; i++) {
                    if(arr[i] < 0) {
                        negative++;
                    }
                    else if(arr[i] > 0) {
                        positive++;
                    }
                    else if(arr[i] == 0) {
                        zero++;
                    }
                }
                System.out.print(negative+" "+zero+" "+positive);
                System.out.println();   
            }
		}
	}
}