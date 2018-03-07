//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: Lab03 - Page 109 - #3.5)
//Class:                   CO SCI 290
//Date:                    02/27/2018
//Description:        Find future dates
import java.util.Scanner;

public class FutureDates {
    public static void main(String[] args) {
        System.out.println("This program will take a day as a number and a second input. From there will display what day it is in the future.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's day(Number 0-6), example Sunday is 0, Monday is 1: ");
        int today = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int elapsed = input.nextInt();
        String todayString = "";
        String day = "";
        switch (today) {
            case 0: todayString = "Sunday";
                    break;
            case 1: todayString = "Monday";
                    break;
            case 2: todayString = "Tuesday";
                    break;
            case 3: todayString = "Wednesday";
                    break;
            case 4: todayString = "Thursday";
                    break;
            case 5: todayString = "Friday";
                    break;
            case 6: todayString = "Saturday";
                    break;
            default: System.out.println("Invalid day");
                     break;
        }
        switch (today + elapsed % 7) {
            case 0: day = "Sunday";
                    break;
            case 1: day = "Monday";
                    break;
            case 2: day = "Tuesday";
                    break;
            case 3: day = "Wednesday";
                    break;
            case 4: day = "Thursday";
                    break;
            case 5: day = "Friday";
                    break;
            case 6: day = "Saturday";
                    break;
            default: System.out.println("Invalid day");
                     break;
        }
        System.out.print("Today is " + todayString + " and the future day is " + day);
    }
}
