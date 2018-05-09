//Written by:           Kyle Liu & Raul Oregel
//Assignment:         Assignment info (ex.: LAB12 - Page 278 - #7.9)
//Class:                   CO SCI 290
//Date:                    05/08/2018
//Description:        Find the smallest element
import java.util.Scanner;

public class SmallestElement {

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("This program prompts the user to enter ten numbers, invokes this method to return the minimum value, and displays the minimum value.");
      double[] arr = new double[10];
      System.out.print("Enter 10 numbers: ");
      // Loop to take 10 number input
      for(int i = 0; i < arr.length; i++) {
         arr[i] = input.nextDouble();
      }
      // Print smallest number
      System.out.println("The minimum number is: " + min(arr));
   }
   // Determines smallest number
   public static double min(double[] array) {
      double small = array[0];
      
      for(int i = 0; i < array.length; i++) {
         if(small > array[i]) {
            small = array[i];
         }
      }
      
      return small;
   }

}