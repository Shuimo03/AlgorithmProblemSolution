package PurpleBook.chapter3.Java;
import java.util.Scanner;
import java.util.Arrays;
/**
 * 开灯问题,有n盏灯，编号为1-n。第一个人把所有灯打开，第二个人按下所有编号为2的倍数开关(这些灯全部关闭)，第三个人按下所有
 * 编号为3的倍数开关(关掉的灯打开，开了灯关掉)，以此类推，一共k个人，最后有那些灯开着？输入n和k，输出开着的灯编号，k<=n<=1000
 */

public class OpenAndCloseLamp{

    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int arr[] = new int[1010];
            int n = scanner.nextInt();  // 灯数
            int k = scanner.nextInt();  // 人数
            Arrays.fill(arr, 0); // 数组清零
            //模拟这个过程
            for (int i = 1; i <= k; i++) {
                for (int j = 1; j <= n; j++) {
                    if (j % i == 0) {
                        //原文中=! !是逻辑取反,Java里面用不了,只能自己实现,
                        // !代表逻辑取反，即：把非0的数值变为0，0变为1; 0 == false 1 == true
                        if (arr[j] == 0) {
                            arr[j] = 1;
                        } else {
                            arr[j] = 0;
                        }
                    }
                }
            }

            for (int i = 1; i <= n; i++) {
               if(arr[i] == 1){
                   System.out.print(i+" ");
               }
            }
            System.out.println();
        }
    }
}