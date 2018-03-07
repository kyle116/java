 //Written by:           Kyle Liu & Raul Oregel
//Assignment:         Assignment info (ex.: Lab04 - Page 108 - #3.1)
//Class:                   CO SCI 290
//Date:                    03/06/2018
//Description:        Algebra: solve quadratic equations
import java.util.Scanner;

public class QuadraticEquations {
    public static void main(String[] args) {
        System.out.println("Program will take values for a, b, and c and displays the result based on the discriminant");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers for a, b, c as integers seperated by spaces: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double discriminant = Math.pow(b, 2) - (4*a*c);
        if(discriminant > 0) {
            double r1 = (-b + Math.pow(discriminant, .5))/(2*a);
            double r2 = (-b - Math.pow(discriminant, .5))/(2*a);
            System.out.print("The equation has two roots " + r1 + " and " + r2);
        } else if(discriminant == 0) {
            System.out.println("The equation has one root -1");
        } else if(discriminant < 0) {
            System.out.println("The equation has no real roots");
        }
    }
}
