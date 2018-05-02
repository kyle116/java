//Written by:           Kyle Liu & Raul Oregel
//Assignment:         Assignment info (ex.: LAB11 - Page 276 - #7.2)
//Class:                   CO SCI 290
//Date:                    05/01/2018
//Description:        Reverse the numbers entered
import java.util.Scanner;

public class ReverseNumbers {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("This program that reads ten integers and displays them in the reverse of the order in which they were read");
      
      // User input
      System.out.print("Please enter 10 integers: ");
      String display = "";
      for(int i = 0; i < 10; i++) {
         int entered = input.nextInt();
         // Add every new input to front of string
         display = entered + " " + display;
      }
      System.out.println(display);
   }
}