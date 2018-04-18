//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: LAB07 - Page 150 - #4.1)
//Class:                   CO SCI 290
//Date:                    04/17/2018
//Description:        Geometry: area of a pentagon
import java.util.Scanner;

public class AreaPentagon {

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("This program prompts the user to enter the length from the center of a pentagon to a vertex and computes the area of the pentagon, as shown in the following figure");
      System.out.print("Enter the length from the center to a vertex: ");
      double r = input.nextDouble();
      double side = 2 * r * Math.sin(Math.PI/5);
      double area = (5 * side * side)/(4 * Math.tan(Math.PI/5));
      System.out.println("The area of the pentagon is " + area);
   }
}