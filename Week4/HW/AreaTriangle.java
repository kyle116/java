//Written by:           Kyle Liu & Raul Oregel 
//Assignment:         Assignment info (ex.: HW03 - Page 73 - #2.19) 
//Class:                   CO SCI 290
//Date:                    02/27/2018
//Description:        Geometry: area of a triangle
import java.util.Scanner;

public class AreaTriangle {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter three points for a triangle: ");
      double int1 = input.nextDouble();
      double int2 = input.nextDouble();
      double int3 = input.nextDouble();
      double int4 = input.nextDouble();
      double int5 = input.nextDouble();
      double int6 = input.nextDouble();
      double side1 = Math.pow(Math.pow(int3 - int1, 2) + Math.pow(int4 - int2, 2), .5);
      double side2 = Math.pow(Math.pow(int5 - int1, 2) + Math.pow(int6 - int2, 2), .5);
      double side3 = Math.pow(Math.pow(int5 - int3, 2) + Math.pow(int6 - int4, 2), .5);
      double s = (side1 + side2 + side3)/2;
      double area = Math.pow(s*(s - side1)*(s - side2)*(s - side3), .5);
      System.out.println("The area of the triangle is " + area);
   }
}