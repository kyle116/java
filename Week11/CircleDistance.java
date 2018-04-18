//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: LAB07 - Page 151 - #4.2)
//Class:                   CO SCI 290
//Date:                    04/17/2018
//Description:        Geometry: great circle distance
import java.util.Scanner;

public class CircleDistance {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("This program prompts the user to enter the latitude and longitude of two points on the earth in degrees and displays its great circle distance");
      
      // User input of Latitude and Longitude
      System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
      double lat1 = input.nextDouble();
      double long1 = input.nextDouble();
      System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
      double lat2 = input.nextDouble();
      double long2 = input.nextDouble();
      
      // Calculate the Distance
      double d = 6371.01 * Math.acos((Math.sin(Math.toRadians(lat1)) * Math.sin(Math.toRadians(lat2))) + (Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) * Math.cos(Math.toRadians(long1) - Math.toRadians(long2))));
      System.out.println("The distance between the two points is " + d + " km");
   }
}