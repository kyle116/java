//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: LAB05 - Page 194 - #5.19)
//Class:                   CO SCI 290
//Date:                    03/21/2018
//Description:        Display numbers in a pyramid pattern

public class PyramidPattern {
    public static void main(String[] args) {
        System.out.println("This program prints out a pyramid of numbers");
        int start = 0;
        int end = 7;
        for (int row = 1; row <= 128; row += row) {
            // Display white space
            for (int i = 0; i < end; i++) {
                System.out.print("    ");
            }
            // Display acending numbers
            for (int k = 1; k <= row; k += k) {
                System.out.printf("%4d", k);
            }
            // Display decending numbers
            for (int j = start; j > 0 ; j /= 2 ) {
                System.out.printf("%4d", j);
            }
            System.out.println();
            end--;
            start = row;
        }
    }
}
