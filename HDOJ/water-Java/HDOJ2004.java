import java.util.Scanner;
public class HDOJ2004{

    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){

            int n = scanner.nextInt();
            if(n < 0 || n > 100){
                System.out.println("Score is error!");
            }
            else{
              
                int score = n/10;
                switch(score)
                {
                    case 10:
                    case 9:
                            System.out.println("A");
                            break;
                    case 8:
                        System.out.println("B");
                        break;
                    case 7:
                        System.out.println("C");
                        break;
                    case 6:
                        System.out.println("D");
                        break;
                   default:
                        System.out.println("E");
                        break;
                }
            }
           
        }
    }
}