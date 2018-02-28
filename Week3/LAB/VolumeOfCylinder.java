//Written by:           Kyle Liu & Raul Oregel 
//Assignment:         Assignment info (ex.: Lab02 - Page 69 - #2.2) 
//Class:                   CO SCI 290
//Date:                    02/20/2018
//Description:         Compute the volume of a cylinder
import java.util.Scanner;

public class VolumeOfCylinder {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the radius and length of a cylinder: ");
      double radius = input.nextDouble();
      double length = input.nextDouble();
      final double PI = 3.14;
      double area = radius * radius * PI;
      System.out.println("Radius entered: " + radius + ". Length entered: " + length);
      System.out.println("The area is " + radius * radius * PI);
      System.out.println("The volume is " + area * length);
   }
}