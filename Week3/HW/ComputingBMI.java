//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: HW02 - Page 71 - #2.14)
//Class:                   CO SCI 290
//Date:                    02/22/2018
//Description:         Health application: computing BMI
import java.util.Scanner;

public class ComputingBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double kilograms = input.nextDouble() * .45359237;
        System.out.print("Enter height in inches: ");
        double meters = input.nextInt() * .0254;
        System.out.println("BMI is " + kilograms/(meters * meters));
    }
}