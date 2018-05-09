//Written by:           Kyle Liu & Raul Oregel
//Assignment:         Assignment info (ex.: LAB12 - Page 278 - #7.10)
//Class:                   CO SCI 290
//Date:                    05/08/2018
//Description:        Find the index of the smallest element
import java.util.Scanner;

public class SmallestIndex {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("This program prompts the user to enter ten numbers, invokes this method to return the index of the smallest element, and displays the index.");
      int[] arr = new int[10];
      System.out.print("Enter 10 numbers: ");
      // Loop to take 10 number input
      for(int i = 0; i < arr.length; i++) {
         arr[i] = input.nextInt();
      }
      // Print smallest number
      System.out.println("The smallest number's index is: " + indexOfSmallestElement(arr));
   }
   public static int indexOfSmallestElement(int[] array) {
      int small = array[0];
      int smallIndex = 0;
      for(int i = 0; i < array.length; i++) {
         if(small > array[i]) {
            small = array[i];
            smallIndex = i;
         }
      }
      
      return smallIndex;
   }
}