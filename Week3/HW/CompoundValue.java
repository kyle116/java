//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: HW02 - Page 71 - #2.13)
//Class:                   CO SCI 290
//Date:                    02/22/2018
//Description:         Financial application: compound value
import java.util.Scanner;

public class CompoundValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        double savings = input.nextInt();
        savings = savings * (1 + 0.00417);
        savings = (100 + savings) * (1 + 0.00417);
        savings = (100 + savings) * (1 + 0.00417);
        savings = (100 + savings) * (1 + 0.00417);
        savings = (100 + savings) * (1 + 0.00417);
        savings = (100 + savings) * (1 + 0.00417);
        System.out.println("After the sixth month, the account value is " + savings);
    }
}
