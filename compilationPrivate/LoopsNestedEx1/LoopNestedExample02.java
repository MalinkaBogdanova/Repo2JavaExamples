package LoopsNestedEx1;

public class LoopNestedExample02 {
    /*
1
2	3
4	5	6
7	8	9	10
     */
    public static void main(String[] args) {
        int k =1;
        for (int i = 1; i <=4; i++) {
            System.out.println();
            for (int j = 0; j < i; j++) {
                System.out.print(k);
                System.out.print("\t");
                k++;

            }

        }

    }
}
