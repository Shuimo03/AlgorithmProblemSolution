import java.util.Scanner;
public class HDOJ2007{
    
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int x = 0;
            int y = 0;
            if(n > m){
                int temp = n;
                n = m;
                m = temp;
            }
            for(;  n<=m; n++){
                if(n%2 == 0){
                  x += Math.pow(n,2);
                }
                else{
                  y += Math.pow(n,3);
                }
            }
           System.out.println(x+" "+y);
        }
    }
}