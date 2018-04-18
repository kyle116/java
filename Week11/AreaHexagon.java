//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: LAB07 - Page 151 - #4.4)
//Class:                   CO SCI 290
//Date:                    04/17/2018
//Description:        Geometry: area of a hexagon
import java.util.Scanner;

public class AreaHexagon {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("This program prompts the user to enter the side of a hexagon and displays its area.");
      
      // User input side length
      System.out.print("Enter the side: ");
      double side = input.nextDouble();
      
      // Area Calculation
      double area = (6 * side * side ) / ( 4 * Math.tan(Math.PI/6));
      System.out.printf("The area of the hexagon is %.2f", area);
   }
}