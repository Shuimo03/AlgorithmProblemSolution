//哈希算法,时间换空间
import java.util.Scanner;
import java.util.Arrays;
public class HDOJ1425{
    public static void main(String[]args){
        
        Scanner scanner = new Scanner(System.in);
        int MAXN = 1000001;
        int arr[] = new int[MAXN];

        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            Arrays.fill(arr,0);
            for(int i = 0; i < n; i++){
                int t = scanner.nextInt();
                arr[500000+t] = 1;
            }

            for(int i = 1000000; m > 0; i--){
                if(arr[i] == 1){
                    if(m > 1) System.out.printf("%d ",i-500000);
                    else      System.out.printf("%d\n",i-500000);
                    m--;
                }
            }
        }
    }
}