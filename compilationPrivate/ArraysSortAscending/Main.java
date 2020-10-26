package ArraysSortAscending;

import java.util.Arrays;
import java.util.Scanner;

//sort the numbers in ascending order
public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static int[] getCapacity(int capacity) {
        int[] arrayNew = new int[capacity];
        for (int i = 0; i < arrayNew.length; i++) {
            arrayNew[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return arrayNew;
    }

    public static void sortNumbersAsc(int[] array) {
        int k;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    k = array[i];
                    array[i] = array[j];
                    array[j] = k;
                }
            }

            System.out.print(array[i]);
        }
    }

    public static void main(String[] args) {
        int[] newArray = getCapacity(4);
        System.out.println(Arrays.toString(newArray));
        sortNumbersAsc(newArray);
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
