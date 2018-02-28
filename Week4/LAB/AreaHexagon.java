//Written by:           Kyle Liu & Raul Oregel 
//Assignment:         Assignment info (ex.: Lab03 - Page 72 - #2.16) 
//Class:                   CO SCI 290
//Date:                    02/27/2018
//Description:         Geometry: area of a hexagon
import java.util.Scanner;

public class AreaHexagon {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the side: ");
      double side = input.nextDouble();
      System.out.println("The area of the hexagon is " + ((3 * Math.pow(3, .5))/2) * (side * side));
      System.out.println(Math.pow(3, .5));
   }
}
