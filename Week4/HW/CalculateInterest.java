//Written by:           Kyle Liu & Raul Oregel 
//Assignment:         Assignment info (ex.: HW03 - Page 74 - #2.20) 
//Class:                   CO SCI 290
//Date:                    02/27/2018
//Description:        Financial application: calculate interest
import java.util.Scanner;
public class CalculateInterest {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
      int balance = input.nextInt();
      double annualInterestRate = input.nextDouble();
      System.out.println("The interest is " +  (balance * (annualInterestRate/1200)));
   }
}