//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: HW10 - Page 238 - #6.17)
//Class:                   CO SCI 290
//Date:                    04/25/2018
//Description:        Display matrix of 0s and 1s
import java.util.Scanner;

public class MyTriangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write a test program that reads three sides for a triangle and computes the area if\n" +
                "the input is valid");

        System.out.print("Enter 3 sides of a triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.println(isValid(side1, side2, side3) ? "The area of the triangle is: " + area(side1, side2, side3) : "The 3 sides are invalid.");
    }
    /** Return true if the sum of any two sides is
     * greater than the third side. */
    public static boolean isValid(double side1, double side2, double side3) {
        return ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1));
    }



    /** Return the area of the triangle. */
    public static double area(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
