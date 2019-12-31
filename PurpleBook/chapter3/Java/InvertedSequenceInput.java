package PurpleBook.chapter3.Java;
import java.util.Scanner;;
/**
 * 读入一些整数,逆序输出到一行,整数不超过100,例如输入 1 2 3 4 5, 输出5 4 3 2 1
 * */
public class InvertedSequenceInput{

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < arr.length; i++){
                arr[i] = scanner.nextInt();
            }
            for(int i = arr.length-1; i>=0; i--){
                System.out.printf("%d ",arr[i]);
            }
            System.out.println();
        }
    }
}