//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: HW02 - Page 71 - #2.11)
//Class:                   CO SCI 290
//Date:                    02/22/2018
//Description:         Population projection
import java.util.Scanner;

public class PopulationProjection {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        int population = 312032486;
        int secondsPerBirth = 7;
        int secondsPerDeath = 13;
        int secondsPerImm = 45;
        int secondsYears = years * 31536000;
        int births = secondsYears/secondsPerBirth;
        int deaths = secondsYears/secondsPerDeath;
        int immigrants = secondsYears/secondsPerImm;
        int projection = population + births - deaths + immigrants;

        System.out.println("The population in " + years + " years is " + projection);
    }
}