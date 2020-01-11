import java.util.Scanner;

public class A{

/**
 解题思路，先算出2个数的最大公约数，然后通过最大公约数去获得对应的fib数
 */

    /**
     O(n) fib sequence
     使用DP的方式
     */
    static long Fib(long f){
        long arr[] = new long[(int) (f+2)];
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2; i <= f; i++){
            arr[i] = arr[i-1]+arr[i-2];
        }
        return arr[(int) f];
    }

    static long GCD(long n, long m){
        return m == 0 ? n : GCD(m, n%m);
    }

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
       while (T-->0){
           long n = scanner.nextLong();
           long m = scanner.nextLong();
           long gcd = GCD(n, m);
           System.out.println(Fib(gcd));
       }
    }
}