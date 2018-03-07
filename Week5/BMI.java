//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: Lab03 - Page 109 - #3.6)
//Class:                   CO SCI 290
//Date:                    02/27/2018
//Description:        Health application: BMI
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        System.out.println("Program will tell you the BMI based on the entered height and weight.");
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter feet: ");
        int feet = input.nextInt();

        // Prompt the user to enter height in inches
        System.out.print("Enter inches: ");
        int height = input.nextInt();

        final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
        final double METERS_PER_INCH = 0.0254; // Constant

        // Compute BMI
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = (height + (feet*12)) * METERS_PER_INCH;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        // Display result
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
