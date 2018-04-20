//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: HW07 - Page 152 - #4.8)
//Class:                   CO SCI 290
//Date:                    04/20/2018
//Description:        Find the character of an ASCII code
import java.util.Scanner;

public class ASCIICode {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program receives an ASCII code (an integer between 0 and 127) and displays its character");
        System.out.print("Enter an ASCII code: ");
        int code = input.nextInt();
	// Convert int to character to display
        char letter = (char) code;
        System.out.println("The character for ASCII code " + code + " is " + letter);
    }

}
