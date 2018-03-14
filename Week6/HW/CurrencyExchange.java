//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: HW05 - Page 116 - #3.31)
//Class:                   CO SCI 290
//Date:                    03/14/2018
//Description:        Financials: currency exchange
import java.util.Scanner;

public class CurrencyExchange {
    public static void main(String[] args) {
        System.out.println("This program prompts the user to enter\n" +
                "the exchange rate from currency in U.S. dollars to Chinese RMB. Prompt the user\n" +
                "to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert from\n" +
                "Chinese RMB and U.S. dollars. Prompt the user to enter the amount in U.S. dollars\n" +
                "or Chinese RMB to convert it to Chinese RMB or U.S. dollars, respectively. ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double exchangeRate = input.nextDouble();
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int convertFrom = input.nextInt();
        if (convertFrom == 1) {
            System.out.print("Enter the RMB amount: ");
            double RMB = input.nextDouble();
            System.out.println("" + RMB + " yuan is $" + (RMB/exchangeRate));
        } else if( convertFrom == 0) {
            System.out.print("Enter the dollar amount: ");
            double dollar = input.nextDouble();
            System.out.println("$" + dollar + " is " + (dollar * exchangeRate) + " yuan");
        } else {
            System.out.println("Incorrect input.");
        }
    }
}
