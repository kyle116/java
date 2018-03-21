//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: LAB05 - Page 193 - #5.16)
//Class:                   CO SCI 290
//Date:                    03/20/2018
//Description:        Find the factors of an integer
import java.util.Scanner;

public class FactorsInteger {

   public static void main(String[] args) {
      System.out.println("This program reads an integer and displays all its smallest factors in increasing order.");
      Scanner input = new Scanner(System.in);
      System.out.print("Enter input integer: ");
      int inputInt = input.nextInt();
      int i = 2; 
      while(i <= inputInt) {
         if(inputInt % i == 0) {
            System.out.print(i + " ");
            inputInt /= i;
         } else {
            i++;
         }
      }      
   }
   
}