//Written by:           Kyle Liu & Raul Oregel  
//Assignment:         Assignment info (ex.: LAB05 - Page 111 - #3.18)
//Class:                   CO SCI 290
//Date:                    03/13/2018
//Description:        Cost of shipping
import java.util.Scanner;

public class ShippingCost {
   public static void main(String[] args) {
      System.out.println("This program prompts the user to enter the weight of the package and display the shipping cost.");
      Scanner input = new Scanner(System.in);
      System.out.print("Please enter the weight of your package: ");
      double weight = input.nextDouble();
      if(weight > 0 && weight <= 1) {
         System.out.println("The cost of shipping is $3.50");
      } else if(weight > 1 && weight <= 3) {
         System.out.println("The cost of shipping is $5.50");      
      } else if(weight > 3 && weight <= 10) {
         System.out.println("The cost of shipping is $8.50");      
      } else if(weight > 10 && weight <= 20) {
         System.out.println("The cost of shipping is $10.50");      
      } else {
         System.out.println("Maximum weight exceeded. The package cannot be shipped.");
      }
   }
}