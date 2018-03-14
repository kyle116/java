//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: HW05 - Page 114 - #3.26)
//Class:                   CO SCI 290
//Date:                    03/14/2018
//Description:        Use the &&, || and ^ operators
import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        System.out.println("This program prompts the user to enter an integer and determines\n" +
                "whether it is divisible by 5 and 6, whether it is divisible\n" +
                "by 5 or 6, and whether it is divisible by 5 or 6, but not both");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer(whole number): ");
        int number = input.nextInt();
        System.out.println("Is 10 divisible by 5 and 6? " + (number % 5 == 0 && number % 6 == 0));
        System.out.println("Is 10 divisible by 5 or 6? " + (number % 5 == 0 || number % 6 == 0));
        System.out.println("Is 10 divisible by 5 or 6, but not both? " + (number % 5 == 0 ^ number % 6 == 0));
    }
}
