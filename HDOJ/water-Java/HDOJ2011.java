import java.util.Scanner;
import java.text.DecimalFormat;
public class HDOJ2011{

    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int m = scanner.nextInt();
            DecimalFormat dateFormat = new DecimalFormat("#.00");
            for(int i = 0; i < m;i++){
              int n = scanner.nextInt();
               double sum = 0;
              for(int j = 1; j <= n; j++){
                  if((j & 1) != 0){
                      sum += (double) 1/j;
                  }
                  else{
                      sum-=(double)1/j;
                  }
              }
              System.out.printf("%.2f\n",sum);
            }
        }
    }
}