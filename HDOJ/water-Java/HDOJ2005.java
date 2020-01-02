import java.util.Scanner;
public class HDOJ2005{

    public static void main(String[]args){
        
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
           String date = scanner.next();
           //获取两次/出现的位置,并且得到对应的字符串
           int t1 = date.indexOf("/");
           int t2 = date.lastIndexOf("/");

           String year = date.substring(0,t1);
           String month = date.substring(t1+1,t2);
           String day = date.substring(t2+1,date.length());

           //将时期转换未整数
           int y = Integer.parseInt(year);
           int m = Integer.parseInt(month);
           int d = Integer.parseInt(day);
           int DaysCnt = 0;

           int[]CY = {0,31,29,31,30,31,30,31,31,30,31,30}; //平年
           int[]LY = {0,31,28,31,30,31,30,31,31,30,31,30}; //闰年

           if(y% 4 == 0 && y% 100 !=0 || y%400 == 0){
              for(int i = 0; i <m; i++){
                DaysCnt += CY[i];
              }
           }
           else{
               for(int i = 0; i< m; i++){
                DaysCnt+=LY[i];
               }
           }
           System.out.println(DaysCnt+d);
        }
    }
}