//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: HW05 - Page 113 - #3.23)
//Class:                   CO SCI 290
//Date:                    03/14/2018
//Description:        Geometry: point in a rectangle?
import java.util.Scanner;

public class RectanglePoint {
    public static void main(String[] args) {
        System.out.println("This program prompts the user to enter a point (x, y) and checks whether the point is \n" +
                "within the rectangle centered at (0, 0) with width 10 and height 5");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates(numbers separated by spaces): ");
        double x = input.nextInt();
        double y = input.nextInt();
        boolean horDistance = x > (10/2);
        boolean vertDistance = y > (5.0/2);
        System.out.println("Point (" + x + ", " + y + ") is" + (horDistance && vertDistance ? " not" : "") + " in the rectangle ");
    }
}
