package ArraysCodingEx99;

import java.util.Arrays;
import java.util.Scanner;

// Create a program using arrays that sorts a list of integers in descending order.
// Descending order is highest value to lowest.
// In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
// ultimately have an array with 106,81,26, 15, 5 in it.
// Set up the program so that the numbers to sort are read in from the keyboard.
// Implement the following methods - getIntegers, printArray, and sortIntegers
// getIntegers returns an array of entered integers from keyboard
// printArray prints out the contents of the array
// and sortIntegers should sort the array and return a new array containing the sorted numbers
// you will have to figure out how to copy the array elements from the passed array into a new
// array and sort them and return the new sorted array.

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arrayToTest = getIntegers(5);
        printArray(arrayToTest);
        sortIntegersInArray(arrayToTest);


    }

    public static int[] getIntegers(int capacity) {
        int[] newArraywithCapacity = new int[capacity];
        for (int i = 0; i < newArraywithCapacity.length; i++) {
            //insert from the Keyboard with Scanner class
            newArraywithCapacity[i] = scanner.nextInt();

        }
        return newArraywithCapacity;

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }

    }

    public static void sortIntegersInArray(int[] array) {
        int[] copyOftheArray = Arrays.copyOf(array, array.length);
        int k;
        for (int i = 0; i < copyOftheArray.length; i++) {
            for (int j = i + 1; j <copyOftheArray.length; j++) {
                if (copyOftheArray[j] > copyOftheArray[i]) {
                    //slap it
                    k = copyOftheArray[i];
                    copyOftheArray[i] = copyOftheArray[j];
                    copyOftheArray[j] = k;

                }

            }
            System.out.print(copyOftheArray[i]);

        }


    }

}








