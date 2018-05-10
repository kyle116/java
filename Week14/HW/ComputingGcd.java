//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: HW12 - Page 279 - #7.14)
//Class:                   CO SCI 290
//Date:                    05/10/2018
//Description:        Computing gcd
import java.util.Scanner;

public class ComputingGcd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program prompts the user to enter five numbers, invokes the\n" +
                "method to find the gcd of these numbers, and displays the gcd.");
        // Initial Variables
        int[] numbers = new int[5];
        System.out.print("Enter 5 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.println("The gcd among the numbers entered is " + gcd(numbers));

    }
    // Method to find the gcd
    public static int gcd(int... numbers) {
        int gcd = 1;
        boolean divisor = false;
        for(int i = 2; i <= min(numbers); i++) {
            for(int j = 0; j < numbers.length; j++) {
                // If the number doesnt divide into one of the 5 numbers, break out of the loop
                // and change divisor to false so nothing is set
                if(numbers[j] % i != 0) {
                    divisor = false;
                    break;
                }
                divisor = true;
            }
            gcd = divisor ? i : gcd;
        }
        return gcd;
    }
    // Method to get the smallest number amongst the 5. Gcd can only be as large as the smallest number in the group
    public static int min(int... numbers) {
        int small = numbers[0];
        for(int num : numbers) {
            if(num < small) {
                small = num;
            }
        }
        return small;
    }
}
