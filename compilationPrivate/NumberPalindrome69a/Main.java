package NumberPalindrome69a;

public class Main {

    /*
Write a method called isPalindrome with one int parameter called number.
The method needs to return a boolean.

It should return true if the number is a palindrome number otherwise it should return false.
Check the tips below for more info about palindromes.

Example Input/Output
isPalindrome(-1221); → should return true
isPalindrome(707); → should return true
isPalindrome(11212); → should return false because reverse is 21211 and that is not equal to 11212.
Tip: What is a Palindrome number?
A palindrome number is a number which when reversed is equal to the original number.
For example: 121, 12321, 1001 etc.
Tip: Logic to check a palindrome number

Find the the reverse of the given number.
Store it in some variable say reverse. Compare the number with reverse.


 */
    private static boolean isPalindrome(int number) {
        int reverse = 0;
        int tempValue = number;
        int lastDigit = 0;
        while (number != 0) {
            lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;//0+1
            number = number / 10;
        }
        if (tempValue == reverse) {
            System.out.println("The number: " +tempValue+ " is Palindrome");
            return true;
        } else return false;
    }

    public static void main(String[] args) {
       System.out.println(isPalindrome(121));
       System.out.println(isPalindrome(-1221));
       System.out.println(isPalindrome(707));
       System.out.println(isPalindrome(11212));

    }
}
