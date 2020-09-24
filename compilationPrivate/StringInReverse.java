import java.util.Scanner;

//Reverse the String -develop a method
public class StringInReverse {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String s = scanner.nextLine();
        System.out.println(printReverse(s));
    }
    private static String printReverse(String text) {
        String reverseText = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reverseText = reverseText + text.charAt(i);
        }
        return reverseText;
    }
}
