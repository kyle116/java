//Written by:           Kyle Liu & Raul Oregel 
//Assignment:         Assignment info (ex.: Lab03 - Page 73 - #2.17) 
//Class:                   CO SCI 290
//Date:                    02/27/2018
//Description:        Science: wind-chill temperature
import java.util.Scanner;
public class WindChillTemp {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
      double outTemp = input.nextDouble();
      System.out.print("Enter the wind speed (>=2) in miles per hour: ");
      int windSpeed = input.nextInt();
      System.out.println("The wind chill index is " + (35.74 + (.6215 * outTemp) - (35.75* Math.pow(windSpeed, 0.16)) + (0.4275 * outTemp * Math.pow(windSpeed, 0.16))));
   }
}