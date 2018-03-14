//Written by:           Kyle Liu & Raul Oregel  
//Assignment:         Assignment info (ex.: LAB05 - Page 111 - #3.19)
//Class:                   CO SCI 290
//Date:                    03/13/2018
//Description:        Compute the perimeter of a triangle
import java.util.Scanner;

public class TrianglePerimeter {
   public static void main(String[] args) {
      System.out.println("This program reads three edges for a triangle and computes the perimeter if the input is valid. Otherwise, the input is invalid. The input is valid if the sum of every pair of two edges is greater than the remaining edge. ");
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the 3 sides of the triangle separated by spaces: ");
      double side1 = input.nextDouble();
      double side2 = input.nextDouble();
      double side3 = input.nextDouble();
      if((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1)) {
         System.out.println("The perimeter of the triangle is: " + (side1 + side2 + side3));
      } else {
         System.out.println("The input is invalid, sides do not make up a triangle");
      }
   }
}