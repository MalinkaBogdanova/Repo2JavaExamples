package StringReverse;

import java.util.Scanner;

public class Main {
    public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        String string = scanner.next();
        String empty="";
        for (int i = string.length()-1; i>=0; i--) {
           empty+=string.charAt(i);
        }
        System.out.println(empty);
    }
}
