//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: Lab03 - Page 110 - #3.11)
//Class:                   CO SCI 290
//Date:                    02/27/2018
//Description:        Find the number of days in a month
import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        System.out.println("This program will take an input of month and year and will return the amount of days in the month.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a month as an integer: ");
        int month = input.nextInt();
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        switch (month) {
            case 1: System.out.println("January " + year + " had 31 days");
                    break;
            case 2: System.out.println("February " + year + " had" + (isLeapYear ? " 29 days" : " 28 days"));
                    break;
            case 3: System.out.println("March " + year + " had 31 days");
                    break;
            case 4: System.out.println("April " + year + " had 30 days");
                    break;
            case 5: System.out.println("May " + year + " had 31 days");
                    break;
            case 6: System.out.println("June " + year + " had 30 days");
                    break;
            case 7: System.out.println("July " + year + " had 31 days");
                    break;
            case 8: System.out.println("August " + year + " had 31 days");
                    break;
            case 9: System.out.println("September " + year + " had 30 days");
                    break;
            case 10: System.out.println("October " + year + " had 31 days");
                    break;
            case 11: System.out.println("November " + year + " had 30 days");
                    break;
            case 12: System.out.println("December " + year + " had 31 days");
        }
    }
}
