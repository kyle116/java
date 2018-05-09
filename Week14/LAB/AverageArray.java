//Written by:           Kyle Liu & Raul Oregel
//Assignment:         Assignment info (ex.: LAB12 - Page 277 - #7.8)
//Class:                   CO SCI 290
//Date:                    05/08/2018
//Description:        Average an array
import java.util.Scanner;

public class AverageArray {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("This program prompts the user to enter ten double values, invokes this method, and displays the average value.");
      double[] values = new double[10];
      System.out.print("Enter 10 double values: ");

      for (int i = 0; i < 10; i++) {
        values[i] = input.nextDouble();
      }
      // Calls average and prints it
      System.out.println("The average is " + average(values));
   }

   public static int average(int[] array) {
      int total = 0;
      for (int value : array) {
         total += value;
      }
      return total / array.length;
   }

   public static double average(double[] array) {
      double total = 0.0;
      for (double value : array) {
         total += value;
      }
      return total / array.length;
   }

}