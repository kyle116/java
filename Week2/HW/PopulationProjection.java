//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: Lab01 - Page 31 - #1.11) 
//Class:                   CO SCI 290
//Date:                    02/14/2018
//Description:         Population projection

public class PopulationProjection {

   int population = 312032486;
   int secondsPerBirth = 7;
   int secondsPerDeath = 13;
   int secondsPerImm = 45;
   
   public int getPopProjection(int years) {
      int secondsYears = years * 31536000;
      int births = secondsYears/secondsPerBirth;
      int deaths = secondsYears/secondsPerDeath;
      int immigrants = secondsYears/secondsPerImm;
      return population + births - deaths + immigrants;
   }
   
   public static void main(String[] args) {
      PopulationProjection pop1 = new PopulationProjection();
      System.out.println("The projected population in 1 year is: " + pop1.getPopProjection(1));
      System.out.println("The projected population in 2 years is: " + pop1.getPopProjection(2));
      System.out.println("The projected population in 3 years is: " + pop1.getPopProjection(3));
      System.out.println("The projected population in 4 years is: " + pop1.getPopProjection(4));
      System.out.println("The projected population in 5 years is: " + pop1.getPopProjection(5));
      
      /*
      System.out.println("The projected population in 1 year is: " + (312032486 + ((1 * 31536000)/7) - ((1 * 31536000)/13) + ((1 * 31536000)/45)));
      System.out.println("The projected population in 2 years is: " + (312032486 + ((2 * 31536000)/7) - ((2 * 31536000)/13) + ((2 * 31536000)/45)));
      System.out.println("The projected population in 3 years is: " + (312032486 + ((3 * 31536000)/7) - ((3 * 31536000)/13) + ((3 * 31536000)/45)));
      System.out.println("The projected population in 4 years is: " + (312032486 + ((4 * 31536000)/7) - ((4 * 31536000)/13) + ((4 * 31536000)/45)));
      System.out.println("The projected population in 5 years is: " + (312032486 + ((5 * 31536000)/7) - ((5 * 31536000)/13) + ((5 * 31536000)/45)));
      */
   }
}