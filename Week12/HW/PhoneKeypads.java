//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: HW10 - Page 239 - #6.21)
//Class:                   CO SCI 290
//Date:                    04/26/2018
//Description:        Phone keypads
import java.util.Scanner;

public class PhoneKeypads {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program translates a letter (uppercase or lowercase) to a digit and leaves all other characters intact");

        System.out.print("Enter a string: ");
        String number = input.nextLine();

        // Loop through user input and check if it is a letter or number
        for (int i = 0; i < number.length(); i++) {
            if (Character.isLetter(number.charAt(i))) {
                // if letter, call getNunmber
                System.out.print(getNumber(Character.toUpperCase(number.charAt(i))));
            } else {
                System.out.print(number.charAt(i));
            }
        }
    }

    // Method to return number for character
    public static int getNumber(char uppercaseLetter) {
        int retNum = 0;
        // check where the character falls under
        if (uppercaseLetter >= 'W' && uppercaseLetter <= 'Z') {
            retNum = 9;
        } else if (uppercaseLetter >= 'T' && uppercaseLetter <= 'V') {
            retNum = 8;
        } else if (uppercaseLetter >= 'P' && uppercaseLetter <= 'S') {
            retNum = 7;
        } else if (uppercaseLetter >= 'M' && uppercaseLetter <= 'O') {
            retNum = 6;
        } else if (uppercaseLetter >= 'J' && uppercaseLetter <= 'L') {
            retNum = 5;
        } else if (uppercaseLetter >= 'G' && uppercaseLetter <= 'I') {
            retNum = 4;
        } else if (uppercaseLetter >= 'D' && uppercaseLetter <= 'F') {
            retNum = 3;
        } else if (uppercaseLetter >= 'A' && uppercaseLetter <= 'C') {
            retNum = 2;
        }
        return retNum;
    }
}
