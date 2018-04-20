//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: HW07 - Page 153 - #4.13)
//Class:                   CO SCI 290
//Date:                    04/20/2018
//Description:        Vowel or consonant?
import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program prompts the user to enter a letter and check whether the letter is a vowel or consonant. ");

        System.out.print("Enter a letter : ");
        String letter = input.nextLine();
        char charac = letter.toUpperCase().charAt(0);
        if (!Character.isLetter(charac)) {
            System.out.println(letter + " is invalid input.");
        } else {
            switch(charac) {
                case 'A':
                    System.out.println(letter + " is a vowel");
                    break;
                case 'E':
                    System.out.println(letter + " is a vowel");
                    break;
                case 'I':
                    System.out.println(letter + " is a vowel");
                    break;
                case 'O':
                    System.out.println(letter + " is a vowel");
                    break;
                case 'U':
                    System.out.println(letter + " is a vowel");
                    break;
                default:
                    System.out.println(letter + " is not a vowel");
            }
        }

    }
}
