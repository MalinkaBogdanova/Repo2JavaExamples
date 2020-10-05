package DigitSumChallenge69;

public class Main {
    /*
Write a method with the name sumDigits that has one int parameter called number.
If parameter is >= 10 then the method should process the number and return sum of all digits,
otherwise return -1 to indicate an invalid value.

The numbers from 0-9 have 1 digit so we dont want to process them,
also we dont want to process negative numbers, so also return -1 for negative numbers.

For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
Calling the method sumDigits(1) should return -1 as per requirements described above.
Add some code to the main method to test out the sumDigits method to determine that it
is working correctly for valid and invalid values passed as arguments.

	Create a project with the name DigitSumChallenge.
     */
    private static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        int sum = 0;
        int initialNumber = number;
        //125-->125%10-->5--->sum--->left(12)-->2-->sum-->left(1)-->sum
        while (number>0){
            //least-significant digit
            int lastDigit=number%10;//5//2//1
            sum+=lastDigit;//5//7//8
            //discard the least-significant digit.
            number/=10;
        }



        return sum;

    }

    public static void main(String[] args) {
        System.out.println(sumDigits(125));

    }
}
