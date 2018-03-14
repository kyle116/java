//Written by:           Kyle Liu 
//Assignment:         Assignment info (ex.: HW05 - Page 112 - #3.21)
//Class:                   CO SCI 290
//Date:                    03/13/2018
//Description:        Science: day of the week
import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        System.out.println("This program prompts the user to enter a year, month, and day of the month, and\n" +
                "displays the name of the day of the week");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: (e.g., 2012): ");
        int k = input.nextInt();
        System.out.print("Enter month: 1-12: ");
        int m = input.nextInt();
        System.out.print("Enter the day of the month: 1-31: ");
        int q = input.nextInt();
        int j = k / 100;

        if (m == 1 || m == 2) {
            m = (m == 1) ? 13 : 14;
            k--;
        }
        k = k % 100;
        int h = (q + ((26 * (m + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;
        String day = "";
        switch(h)
        {
            case 0: day = "Saturday";
                    break;
            case 1: day = "Sunday";
                    break;
            case 2: day = "Monday";
                    break;
            case 3: day = "Tuesday";
                    break;
            case 4: day = "Wednesday";
                    break;
            case 5: day = "Thursday";
                    break;
            case 6: day = "Friday";
        }

        System.out.println("Day of the week is " + day);
    }
}