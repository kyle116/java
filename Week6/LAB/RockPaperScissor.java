//Written by:           Kyle Liu & Raul Oregel  
//Assignment:         Assignment info (ex.: LAB05 - Page 111 - #3.17)
//Class:                   CO SCI 290
//Date:                    03/13/2018
//Description:        Game: scissor, rock, paper
import java.util.Scanner;

public class RockPaperScissor {
   public static void main(String[] args) {
      System.out.println("This program that plays the popular scissor-rockpaper game. (A scissor can cut a paper, a\n rock can knock a scissor, and a paper can wrap a rock.) The program randomly generates a\n number 0, 1, or 2 representing scissor, rock, and paper. The program prompts the user to\n enter a number 0, 1, or 2 and displays a message indicating whether the user or the\n computer wins, loses, or draws");
      Scanner input = new Scanner(System.in);
      System.out.print("Enter either scissor (0), rock (1), paper (2): ");
      int userChoice = input.nextInt();
      int computerChoice = (int)((Math.random() * 4) - 1);
      String userString = "";
      String computerString = "";
      switch(userChoice) {
         case 0: userString = "scissor";
                 break;
         case 1: userString = "rock";
                 break;
         case 2: userString = "paper";
                 break;
      }
      switch(computerChoice) {
         case 0: computerString = "scissor";
                 break;
         case 1: computerString = "rock";
                 break;
         case 2: computerString = "paper";
                 break;
      }
      
      if(userChoice == computerChoice) {
         System.out.println("The computer is " + computerString + ". You are " + userString + " too. It is a draw");
         return;
      }
      
      if((userChoice == 0 && computerChoice == 2) 
         || (userChoice == 1 && computerChoice == 0) 
         || (userChoice == 2 && computerChoice == 1)) {
         System.out.println("The computer is " + computerString + ". You are " + userString + ". You won");
      } else {
         System.out.println("The computer is " + computerString + ". You are " + userString + ". You lost");
      }
   }
}