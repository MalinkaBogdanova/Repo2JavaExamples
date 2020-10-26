package ArrayResizeArray;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static int[] testArray = new int[10];

    public static void main(String[] args) {
        System.out.println("Enter 12 int: ");
        getInputFromConsole();
        printArray(testArray);
        resizeArray();
        System.out.println("Enter 12 int: ");
        getInputFromConsole();
        printArray(testArray);

    }

    public static void getInputFromConsole() {
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = scanner.nextInt();
        }

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
          //  System.out.println();
        }
    }

    public static void resizeArray() {
        int[] testArrayOriginal = Main.testArray;
        testArray = new int[12];
        for (int i = 0; i < testArrayOriginal.length; i++) {
            testArray[i] = testArrayOriginal[i];
        }



    }
}
