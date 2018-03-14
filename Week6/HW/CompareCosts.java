//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: HW05 - Page 117 - #3.33)
//Class:                   CO SCI 290
//Date:                    03/14/2018
//Description:        Financial: compare costs
import java.util.Scanner;

public class CompareCosts {
    public static void main(String[] args) {
        System.out.println("This program prompts the user to enter the weight and price of the each package and displays the one with\n" +
                "the better price");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight and price for package 1(seperated by spaces): ");
        int weight1 = input.nextInt();
        double price1 = input.nextDouble();
        System.out.print("Enter weight and price for package 2(seperated by spaces): ");
        int weight2 = input.nextInt();
        double price2 = input.nextDouble();
        if((price1/weight1) > (price2/weight2)) {
            System.out.println("Package 2 has a better price.");
        } else if((price1/weight1) < (price2/weight2)) {
            System.out.println("Package 1 has a better price.");
        } else if((price1/weight1) == (price2/weight2)) {
            System.out.println("Two packages have the same price.");
        }
    }
}
