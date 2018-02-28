//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: Lab01 - Page 31 - #1.10) 
//Class:                   CO SCI 290
//Date:                    02/14/2018
//Description:         Average speed in miles
public class AvgSpeedMiles {   
   public static void main(String[] args) {
      int kilometers = 14;
      double milePerKm = 1.6;
      double runnersTimeHrs = 45.5/60;
      double kmToMiles = kilometers/milePerKm;
      System.out.println("Convert Kilometers to Miles: " + kmToMiles);
      System.out.println("Convert Minutes to Hours: " + runnersTimeHrs);
      System.out.println("Miles divided by Hours: " + kmToMiles/runnersTimeHrs);
   }
}