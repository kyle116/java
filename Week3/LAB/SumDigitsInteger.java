//Written by:           Kyle Liu & Raul Oregel 
//Assignment:         Assignment info (ex.: Lab02 - Page 69 - #2.6) 
//Class:                   CO SCI 290
//Date:                    02/20/2018
//Description:         Sum the digits in an integer
import java.util.Scanner;

public class SumDigitsInteger {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number between 0 and 1000: ");
      int number = input.nextInt();
      int sumOfNumber = (number % 10) + (number/10 % 10) + (number/100 % 10);
      System.out.println("The sum of the digits is " + sumOfNumber);
   }
}