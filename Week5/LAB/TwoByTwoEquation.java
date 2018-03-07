//Written by:           Kyle Liu & Raul Oregel
//Assignment:         Assignment info (ex.: Lab04 - Page 109 - #3.3)
//Class:                   CO SCI 290
//Date:                    03/06/2018
//Description:        Game: add three numbers
import java.util.Scanner;

public class TwoByTwoEquation {
    public static void main(String[] args) {
        System.out.println("Program takes input as integers of variables a, b, c, d, e, and f and displays the result. If ad - bc is 0, the equation has no solution.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c, d, e, f as integers seperated by spaces: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        if((a*d - b*c) == 0) {
            System.out.println("The equation has no solution");
        } else {
            double x = (e*d - b*f)/(a*d - b*c);
            double y = (a*f - e*c)/(a*d - b*c);
            System.out.println("x is " + x + " and y is " + y + "");
        }
    }
}
