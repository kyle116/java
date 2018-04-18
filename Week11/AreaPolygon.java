//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: LAB07 - Page 151 - #4.5)
//Class:                   CO SCI 290
//Date:                    04/17/2018
//Description:        Geometry: area of a regular polygon
import java.util.Scanner;

public class AreaPolygon {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("This program prompts the user to enter the number of sides and their length of a regular polygon and displays its area");
      
      // User input for sides and lengths
      System.out.print("Enter the number of sides: ");
		int numSides = input.nextInt();
		System.out.print("Enter the side: ");
		double side = input.nextDouble();
      
      // Calculate the area
		double area = (numSides * side * side) / (4 * Math.tan(Math.PI/numSides));
		System.out.println("The area of the polygon is " + area);
   }
}