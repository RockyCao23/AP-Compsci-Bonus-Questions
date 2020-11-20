import java.util.Scanner;

public class Main {


    public static void pigLatin(String str){
        String x = "";
        String y = "";
        String z = "ay";
        if (str.length() > 2){
            x = str.substring(1,str.length());
            y = str.substring(0,1);
            System.out.print(x + y + z);

        }


    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word you would like to translate into Pig Latin!");
        pigLatin(scan.nextLine());
    }
}
