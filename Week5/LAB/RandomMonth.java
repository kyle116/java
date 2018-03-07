//Written by:           Kyle Liu & Raul Oregel
//Assignment:         Assignment info (ex.: Lab04 - Page 109 - #3.4)
//Class:                   CO SCI 290
//Date:                    03/06/2018
//Description:        Random Month
import java.util.Scanner;

public class RandomMonth {
    public static void main(String[] args) {
        System.out.println("This program randomly generates an integer between 1 and 12 and displays the English month name January, February, …, December for the number 1, 2, …, 12, accordingly");
        int randomMonth = (int) (Math.random() * 12) + 1;
        switch (randomMonth) {
            case 1: System.out.println("The Random month is: January");
                    break;
            case 2: System.out.println("The Random month is: February");
                    break;
            case 3: System.out.println("The Random month is: March");
                    break;
            case 4: System.out.println("The Random month is: April");
                    break;
            case 5: System.out.println("The Random month is: May");
                    break;
            case 6: System.out.println("The Random month is: June");
                    break;
            case 7: System.out.println("The Random month is: July");
                    break;
            case 8: System.out.println("The Random month is: August");
                    break;
            case 9: System.out.println("The Random month is: September");
                    break;
            case 10: System.out.println("The Random month is: October");
                    break;
            case 11: System.out.println("The Random month is: November");
                    break;
            case 12: System.out.println("The Random month is: December");
                    break;
            default: System.out.println("The Random month is: Invalid month");
                    break;
        }
    }
}
