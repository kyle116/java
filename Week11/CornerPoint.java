//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: LAB07 - Page 151 - #4.7)
//Class:                   CO SCI 290
//Date:                    04/17/2018
//Description:        Corner point coordinates

import java.util.Scanner;
 
public class CornerPoint {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("This program prompts the user to enter the radius of the bounding circle of a pentagon and displays the coordinates of the five corner points on the pentagon");
      System.out.print("Enter the radius of the bounding circle:");
 
      double r = input.nextDouble();
 
      double a1 = Math.PI / 10; // pi/2-2pi/5 is the angle of the first point
      double a2 = Math.PI / 2; // 90° = pi/2
      double a3 = Math.PI / 2 + 2 * Math.PI / 5; // keep going 2pi/5 at a time
      double a4 = Math.PI / 2 + 4 * Math.PI / 5;
      double a5 = Math.PI / 2 + 6 * Math.PI / 5;
      
      // calculating the coordinate
      double x1 = r * Math.cos(a1);
      double y1 = r * Math.sin(a1);
      double x2 = r * Math.cos(a2);
      double y2 = r * Math.sin(a2);
      double x3 = r * Math.cos(a3);
      double y3 = r * Math.sin(a3);
      double x4 = r * Math.cos(a4);
      double y4 = r * Math.sin(a4);
      double x5 = r * Math.cos(a5);
      double y5 = r * Math.sin(a5);
 
      System.out.printf("(%10.4f, %10.4f)\n", x1, y1);
      System.out.printf("(%10.4f, %10.4f)\n", x2, y2);
      System.out.printf("(%10.4f, %10.4f)\n", x3, y3);
      System.out.printf("(%10.4f, %10.4f)\n", x4, y4);
      System.out.printf("(%10.4f, %10.4f)\n", x5, y5);
 
   }
}