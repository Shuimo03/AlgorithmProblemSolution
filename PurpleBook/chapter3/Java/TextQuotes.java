import java.util.Scanner;

public class TextQuotes{

    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str = scanner.nextLine();
            boolean mark = true;
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == '\u001a'){ //EOF
                    break;
                }
                if(str.charAt(i) == '\"'){
                    if(mark == true){
                        System.out.print("``");
                        mark = false;
                        continue;
                    }
                    else{
                        System.out.print("''");
                        mark = true;
                        continue;
                    }
                }
                System.out.print(str.charAt(i));
            }
            System.out.println();
        }
    }
}