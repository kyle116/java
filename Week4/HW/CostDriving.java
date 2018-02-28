//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: HW03 - Page 74 - #2.23)
//Class:                   CO SCI 290
//Date:                    02/27/2018
//Description:        Cost of driving
import java.util.Scanner;

public class CostDriving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the driving distance: ");
        double distance = input.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double mpg = input.nextDouble();
        System.out.print("Enter price per gallon: ");
        double ppg = input.nextDouble();
        System.out.print("The cost of driving is " + ((distance/mpg)*ppg));
    }
}
