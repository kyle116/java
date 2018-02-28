//Written by:           Kyle Liu & Raul Oregel 
//Assignment:         Assignment info (ex.: Lab02 - Page 69 - #2.3) 
//Class:                   CO SCI 290
//Date:                    02/20/2018
//Description:         Convert feet into meters
import java.util.Scanner;

public class FeetToMeters {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a value for feet: ");
      double feet = input.nextDouble();
      double meters = feet * .305;
      System.out.println(feet + " feet is " + meters + " meters");
   }
}