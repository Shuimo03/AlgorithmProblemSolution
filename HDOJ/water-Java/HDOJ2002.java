import java.util.Scanner;
import java.text.DecimalFormat;
public class HDOJ2002{

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            double r = scanner.nextDouble();
            double PI = 3.1415927;
            double result = 4.0/3*PI*r*r*r;
            DecimalFormat decimalFormat = new DecimalFormat("#.000");
            System.out.println(decimalFormat.format(result));
        }
    }
}
