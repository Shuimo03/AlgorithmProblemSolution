import java.util.Scanner;
import java.util.Arrays;
public class HDOJ2000{

    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            String string = input.next();
            char[]arrays = string.toCharArray();
            Arrays.sort(arrays);
            for(int i = 0; i < arrays.length; i++){
                System.out.print(arrays[i]);
                if (i == arrays.length - 1) break;
				System.out.print(" ");
            }
            System.out.println();
        }
    }
}