//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: LAB05 - Page 234 - #6.1)
//Class:                   CO SCI 290
//Date:                    03/27/2018
//Description:        Math: pentagonal numbers

public class PentagonalNumbers {
   // getPentagonalNumber method
   public static int getPentagonalNumber(int n) {
      return  n * (3 * n - 1) / 2;
   }
   
   public static void main(String[] args) {
      System.out.println("This program displays the first 100 petagonal numbers with 10 numbers on each line");
      System.out.print("Numbers: ");
      // Argument passed into method
      int display = 1;
      // Nested for loops to display 10 numbers on each line up to 100
      for(int i = 0; i < 10; i++) {
         for(int j = 0; j < 10; j++) {
            System.out.print(getPentagonalNumber(display) + " ");
            display++; 
         }
         System.out.println("");
      }   
   }

}