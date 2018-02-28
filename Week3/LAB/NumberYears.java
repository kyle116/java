//Written by:           Kyle Liu & Raul Oregel 
//Assignment:         Assignment info (ex.: Lab02 - Page 69 - #2.7) 
//Class:                   CO SCI 290
//Date:                    02/20/2018
//Description:         Find the number of years
import java.util.Scanner;

public class NumberYears {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number of minutes: ");
      int minutes = input.nextInt();
      int hours = minutes/60;
      int days = hours/24;
      intint years = days/365;
      System.out.println(minutes + " minutes is approximately " + years + " years and "  + (days % 365) + " days");
   }
}