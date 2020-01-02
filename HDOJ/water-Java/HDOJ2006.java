import java.util.Scanner;
public class HDOJ2006{
 
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int cnt = 1;
           while(n --> 0){
               int sum = scanner.nextInt();
                if(sum%2 == 1){
                    cnt*=sum;
                }
           }
           System.out.println(cnt);
        }
    }
}