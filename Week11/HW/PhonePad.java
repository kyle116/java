//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: HW07 - Page 154 - #4.15)
//Class:                   CO SCI 290
//Date:                    04/20/2018
//Description:        Phone key pads
import java.util.Scanner;


public class PhonePad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program prompts the user to enter a letter and displays its corresponding number.");

        // User input
        System.out.print("Enter a letter: ");
        String letter = input.nextLine();
        // Character to compare
        char charac = letter.charAt(0);
        charac = Character.toUpperCase(charac);

        // Compare character and display number
        int number = 0;
        if (Character.isLetter(charac)) {
            if (charac == 'W' || charac == 'X' || charac == 'Y' || charac == 'Z')
                number = 9;
            else if (charac == 'T' || charac == 'U' || charac == 'V')
                number = 8;
            else if (charac == 'P' || charac == 'Q' || charac == 'R' || charac == 'S')
                number = 7;
            else if (charac == 'M' || charac == 'N' || charac == 'O')
                number = 6;
            else if (charac == 'J' || charac == 'K' || charac == 'L')
                number = 5;
            else if (charac == 'G' || charac == 'H' || charac == 'I')
                number = 4;
            else if (charac == 'D' || charac == 'E' || charac == 'F')
                number = 3;
            else if (charac == 'A' || charac == 'B' || charac == 'C')
                number = 2;
            System.out.println("The corresponding number is " + number);
        } else {
            System.out.println(charac + " is an invalid input");
        }
    }
}
