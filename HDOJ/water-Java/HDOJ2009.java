import java.util.Scanner;
import java.text.DecimalFormat;
public class HDOJ2009{

static int arr[] = new int[10010];

    public static void main(String[]args){
        
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            DecimalFormat dateFormat = new DecimalFormat("#.00");
            double sum = 0;
            for(int i = 1; i <= n; i++){
                arr[i] = i;
                System.out.print(arr[i]+" ");
            }
            for(int i = 0; i < m; i++){
                sum += Math.sqrt(arr[n]);
            }
            System.out.println(dateFormat.format(sum));
        }
    }
}