//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: HW04 - Page 110 - #3.14)
//Class:                   CO SCI 290
//Date:                    03/07/2018
//Description:        Game: heads or tails
import java.util.Scanner;

public class HeadsTails {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("The program randomly generates an integer 0 or 1, which represents head or tail. The program will take a guess and display if it was correct or not");
      int headsOrTails = (Math.random() < 0.5) ? 0 : 1;
      System.out.print("Please make a guess 0 for heads or 1 for tails: ");
      int guess = input.nextInt();
      if(guess == headsOrTails) {
         System.out.println("Correct guess!");
      } else {
         System.out.println("Incorrect guess");
      }
   }
}