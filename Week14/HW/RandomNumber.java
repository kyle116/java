//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: HW12 - Page 278 - #7.13)
//Class:                   CO SCI 290
//Date:                    05/10/2018
//Description:        Random number chooser
import java.util.Scanner;

public class RandomNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program returns a random number between\n" +
                "1 and 54, excluding the numbers passed in the argument");
        // Initial variables
        int[] exclude = new int[10];
        String ex = "";
        // Sets the array and creates a string to know what to exclude
        System.out.print("Enter 10 numbers that you want to exclude from 1-54: ");
        for (int i = 0; i < exclude.length; i++) {
            exclude[i] = input.nextInt();
            ex += exclude[i] + " ";
        }
        // Calls random method to get random number and print
        System.out.println("The random number (excluding " + ex + ") generated is: " + getRandom(exclude));
    }
    // method to get random number
    public static int getRandom(int... numbers) {
        int random = (int)(Math.random() * 54 + 1);
        // If number matches in the array create new random number and redo the loop to check
        for(int i = 0 ; i < numbers.length; i++) {
            if(random == numbers[i]) {
                random = (int)(Math.random() * 54 + 1);
                i = 0;
            }
        }
        return random;
    }
}
