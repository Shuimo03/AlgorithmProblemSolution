import java.util.Scanner;

public class HDOJ2001{

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        while(input.hasNext()){

            double x1 = input.nextDouble();
            double y1 = input.nextDouble();
            double x2 = input.nextDouble();
            double y2 = input.nextDouble();

            double res = Math.pow(x1-x2, 2)+Math.pow(y1-y2,2);
            System.out.printf("%.2f",Math.sqrt(res));
            System.out.println();
        }
    }
}