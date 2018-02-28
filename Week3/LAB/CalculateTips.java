//Written by:           Kyle Liu & Raul Oregel 
//Assignment:         Assignment info (ex.: Lab02 - Page 69 - #2.5) 
//Class:                   CO SCI 290
//Date:                    02/20/2018
//Description:         Financial application: calculate tips
import java.util.Scanner;

public class CalculateTips {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the subtotal and a gratuity rate: ");
      double subtotal = input.nextDouble();
      double gratuityRate = input.nextDouble()/100;
      double gratuity = subtotal * gratuityRate;
      double total = gratuity + subtotal;
      System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
   }
}