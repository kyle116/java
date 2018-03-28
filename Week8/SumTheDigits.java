//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: LAB05 - Page 234 - #6.2)
//Class:                   CO SCI 290
//Date:                    03/27/2018
//Description:        Sum the digits in an integer
import java.util.Scanner;

public class SumTheDigits {  
   // Method for sumDigits
   public static int sumDigits(long n) {
      // Variables to calculate sum of digits
      int count = Integer.toString((int)n).length();
      int num = (int) n;
      int sum = num % 10;
      for(int i = 0; i < count - 1; i++) {
         num /= 10;
         sum += num % 10;
      }
      return sum;
   }
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("This program that prompts the user to enter an integer and displays the sum of all its digits.");
      System.out.print("Please enter a whole number: ");
      int number = input.nextInt();
      System.out.print("The sum of the digits are: ");
      // Call sumDigits and pass in the user input
      System.out.println(sumDigits(number));
   }
}