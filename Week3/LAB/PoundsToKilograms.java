//Written by:           Kyle Liu & Raul Oregel 
//Assignment:         Assignment info (ex.: Lab02 - Page 69 - #2.4) 
//Class:                   CO SCI 290
//Date:                    02/20/2018
//Description:         Convert pounds into kilograms
import java.util.Scanner;

public class PoundsToKilograms {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number in pounds: ");
      double pounds = input.nextDouble();
      double kilograms = pounds * .454;
      System.out.println(pounds + " pounds is " + kilograms + " kilograms");
   }
}