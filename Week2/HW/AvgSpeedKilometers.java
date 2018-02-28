//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: Lab01 - Page 31 - #1.12) 
//Class:                   CO SCI 290
//Date:                    02/14/2018
//Description:        Average speed in kilometers

public class AvgSpeedKilometers {
   public static void main(String[] args) {
      int miles = 24;
      double milesToKm = 1.6;
      double kilometers = miles * milesToKm;
      double convertedTime = 1.6763888889;
      System.out.println("Convert Miles to Kilometers: " + (kilometers));
      System.out.println("Miles converted to Kilometers per hour: " + ((kilometers)/convertedTime));
   }
}