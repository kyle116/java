//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: Lab03 - Page 109 - #3.7)
//Class:                   CO SCI 290
//Date:                    02/27/2018
//Description:        Financial application: monetary units
import java.util.Scanner;

public class ComputeChange {
    public static void main(String[] args) {
        System.out.println("The program will tell you the exact change in Dollars, Quarters, Dimes, Nickels, and Pennies. If there are zero of a certain coin, it will be skipped");
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Receive the amount
        System.out.print("Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();

        int remainingAmount = (int)(amount * 100);

        // Find the number of one dollars
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        // Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        // Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        // Find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        // Find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;

        // Display results
        System.out.println("Your amount " + amount + " consists of");
        if(numberOfOneDollars > 0) {
            System.out.println(" " + numberOfOneDollars + " dollar" + (numberOfOneDollars > 1 ? "s" : ""));
        }
        if(numberOfQuarters > 0) {
            System.out.println(" " + numberOfQuarters + " quarter" + (numberOfQuarters > 1 ? "s" : ""));
        }
        if(numberOfDimes > 0) {
            System.out.println(" " + numberOfDimes + " dime" + (numberOfDimes > 1 ? "s" : ""));
        }
        if(numberOfNickels > 0) {
            System.out.println(" " + numberOfNickels + " nickel" + (numberOfNickels > 1 ? "s" : ""));
        }
        if(numberOfPennies > 0) {
            System.out.println(" " + numberOfPennies + (numberOfPennies > 1 ? " pennies" : " penny"));
        }
    }
}
