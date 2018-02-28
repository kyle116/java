//Written by:           Kyle Liu & Raul Oregel 
//Assignment:         Assignment info (ex.: Lab02 - Page 69 - #2.1) 
//Class:                   CO SCI 290
//Date:                    02/20/2018
//Description:         Convert Celsius to Fahrenheit
import java.util.Scanner;

public class CelsiusToFahrenheit {
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a degree in Celsius: ");
      double celsius = input.nextDouble();
      double fahrenheit = (9.0/ 5) * celsius + 32;
      System.out.println("The Celsius degree input was: " + celsius + ".");
      System.out.println(celsius + " degrees Celsius to Fahrenheit is: " + fahrenheit);
   }
}