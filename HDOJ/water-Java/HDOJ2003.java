import java.util.Scanner;
import java.text.DecimalFormat;
public class HDOJ2003{

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            double input  = scanner.nextDouble();
            DecimalFormat dateFormat = new DecimalFormat("#.00");
            System.out.println(dateFormat.format(abs(input)));
        }
    }

    public static double abs(double a){
        return (a < 0) ? -a :a;
    }
}
