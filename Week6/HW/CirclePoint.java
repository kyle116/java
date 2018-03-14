//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: HW05 - Page 112 - #3.22)
//Class:                   CO SCI 290
//Date:                    03/14/2018
//Description:        Geometry: point in a circle?
import java.util.Scanner;

public class CirclePoint {
    public static void main(String[] args) {
        System.out.println("This program prompts the user to enter a point (x, y) and checks whether the point is within the \n" +
                "circle centered at (0, 0) with radius 10");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates(numbers separated by spaces): ");
        double x = input.nextInt();
        double y = input.nextInt();
        double distance = Math.pow((x * x) + (y * y), .5);
        System.out.println("Point (" + x + ", " + y + ") is" + (distance > 10 ? " not" : "") + " in the circle ");
    }
}
