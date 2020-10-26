package ArrayReverseArrayChallenge103;

import java.util.Arrays;

public class Main {
    //-Write a method called reverse() with an int array as a parameter.
    //-The method should not return any value.
    // In other words, the method is allowed to modify the array parameter.
    //-In main() test the reverse() method and print the array both reversed and non-reversed.
    //-To reverse the array, you have to swap the elements, so that the first
    // element is swapped with the last element and so on.
    //-For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.
    //Tip:
    //	-Create a new console project with the name "eReverseArrayChallenge"
    public static void reverse(int[] array) {
        int[] reverse = Arrays.copyOf(array, array.length);
        int k;
        for (int i = 0; i < reverse.length; i++) {
            for (int j = i + 1; j < reverse.length; j++) {
                if (reverse[i] < reverse[j]) {
                    k = reverse[j];
                    reverse[j] = reverse[i];
                    reverse[i] = k;
                }
            }
            System.out.println(reverse[i]);
        }

    }

    public static void main(String[] args) {
        int[] tempArray = {9,4,1,4,12,3,1,33};
        reverse(tempArray);
        System.out.println(Arrays.toString(tempArray));

    }
}
