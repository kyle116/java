//Written by:           Kyle Liu & Raul Oregel
//Assignment:         Assignment info (ex.: LAB11 - Page 277 - #7.3)
//Class:                   CO SCI 290
//Date:                    05/01/2018
//Description:        Count occurrence of numbers
import java.util.Scanner;

public class CountOccurences {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("This program reads the integers between 1 and 100 and counts the occurrences of each.");
      // Starting variables, array up to 100
      int number = 0;
      int[] numbers = new int[100];
      System.out.print("Enter the integers between 1 and 100: ");
      // Take user inputs until 0     
      do {
         number = input.nextInt();
         numbers[number] += number == 0 ? 0 : 1;
      } while(number != 0);
      
      // Print all numbers that dont have 0 as values
      for(int i = 0; i < numbers.length; i++) {
         if(numbers[i] != 0) {
            System.out.println(i + " occurs " + numbers[i] + " time" + (numbers[i] > 1 ? "s" : ""));
         }
      }
   }
}