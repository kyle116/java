//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: LAB05 - Page 193 - #5.14)
//Class:                   CO SCI 290
//Date:                    03/20/2018
//Description:        Compute the greatest common divisor
import java.util.Scanner;

public class GreatestCommonDivisor {
   /** Main method */
   public static void main(String[] args) {
      // Create a Scanner
      Scanner input = new Scanner(System.in);
      System.out.println("This program prompts the user to enter two positive integers and displays the gcd.");

      // Prompt the user to enter two integers
      System.out.print("Enter first integer: ");
      int n1 = input.nextInt();
      System.out.print("Enter second integer: ");
      int n2 = input.nextInt();

      int gcd = (n1 < n2) ? n1 : n2;
      while (n1 % gcd != 0 || n2 % gcd != 0) {
			gcd--;
		}


      System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);
   }
}