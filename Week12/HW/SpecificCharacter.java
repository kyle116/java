//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: HW10 - Page 239 - #6.21)
//Class:                   CO SCI 290
//Date:                    04/26/2018
//Description:        Occurrences of a specified character
import java.util.Scanner;

public class SpecificCharacter {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("This program prompts the user to enter a string followed by a character and displays the number\n" +
                "of occurrences of the character in the string.");

        // User inputs
        System.out.print("Please enter a string of text: ");
        String str = input.nextLine();
        System.out.print("Please enter a character to search for: ");
        char c = input.next().charAt(0);
        System.out.println("The amount of times " + c + " is present in " + str + " is " + count(str, c) + " times.");
    }

    // Count frequency method
    public static int count(String str, char a) {
        // variable to keep track of the count
        int counter = 0;
        for(int i = 0; i < str.length(); i++) {
            // if letter is equal to character tracked
            if(str.charAt(i) == a) {
                counter += 1;
            }
        }
        return counter;
    }

}
