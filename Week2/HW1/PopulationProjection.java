//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: Lab01 - Page 31 - #1.11) 
//Class:                   CO SCI 290
//Date:                    02/14/2018
//Description:         Population projection

public class PopulationProjection {
   public static void main(String[] args) {
      System.out.println("This program estimates the population for the next 5 years:");
      System.out.println("The projected population in 1 year is: " + (312032486 + ((1 * 31536000)/7) - ((1 * 31536000)/13) + ((1 * 31536000)/45)));
      System.out.println("The projected population in 2 years is: " + (312032486 + ((2 * 31536000)/7) - ((2 * 31536000)/13) + ((2 * 31536000)/45)));
      System.out.println("The projected population in 3 years is: " + (312032486 + ((3 * 31536000)/7) - ((3 * 31536000)/13) + ((3 * 31536000)/45)));
      System.out.println("The projected population in 4 years is: " + (312032486 + ((4 * 31536000)/7) - ((4 * 31536000)/13) + ((4 * 31536000)/45)));
      System.out.println("The projected population in 5 years is: " + (312032486 + ((5 * 31536000)/7) - ((5 * 31536000)/13) + ((5 * 31536000)/45)));
   }
}