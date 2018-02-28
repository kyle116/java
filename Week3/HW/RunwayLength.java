//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: HW02 - Page 71 - #2.12)
//Class:                   CO SCI 290
//Date:                    02/22/2018
//Description:         Physics: finding runway length
import java.util.Scanner;

public class RunwayLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter speed and acceleration: ");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();
        System.out.println("The minimum runway length for this airplane is " + ((speed * speed)/(2 * acceleration)));
    }
}