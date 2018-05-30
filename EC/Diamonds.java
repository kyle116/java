//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: Extra Credit Diamond)
//Class:                   CO SCI 290
//Date:                    05/23/2018
//Description:        Display Diamond
import java.util.Scanner;

public class Diamonds {
    public static void main(String[] args) {
        System.out.println("This program prompts the user to enter a character and an integer\n" +
                "and displays a diamond of those characters");
        // Initial Variables
        Scanner input = new Scanner(System.in);
        System.out.print("Input a character: ");
        String character = input.nextLine();
        System.out.print("Input diamond size(odd numbers only): ");
        int lines = input.nextInt() + 1;
        int middle = lines / 2;
        String[] printLines = new String[lines];
        // Odd number of rows for diamond only
        if(lines % 2 == 1) {
            System.out.print("Odd numbers only");
            return;
        }
        String printStr = "";
        // Loop to build middle line of diamond
        for(int i = 1; i < lines; i++) {
            printStr += character + (i == lines ? "" : " ");
        }
        // Builds the non middle rows
        for(int i = 1; i < lines; i++) {
            if(i % 2 == 1 && i < middle) {
                int trimmer = (middle - i) * 2;
                String spaces = "";
                // Accounts for spaces
                for(int j = 0; j < trimmer; j++) {
                    spaces += " ";
                }
                printLines[i] = spaces + printStr.substring(trimmer, printStr.length() - trimmer) + spaces;
                printLines[lines - i] = spaces + printStr.substring(trimmer, printStr.length() - trimmer) + spaces;
            } else if(i % 2 == 0 && i < middle) {
                int trimmer = (middle - i) * 2;
                String spaces = "";
                for(int j = 0; j < trimmer; j++) {
                    spaces += " ";
                }
                printLines[i] = spaces + printStr.substring(trimmer, printStr.length() - trimmer) + spaces;
                printLines[lines - i] = spaces + printStr.substring(trimmer, printStr.length() - trimmer) + spaces;
            } else if(i == middle) {
                printLines[i] = printStr;
            }
        }
        // Print array containing the string of lines
        for (int k = 1; k < lines; k++) {
            System.out.println(printLines[k]);
        }
    }
}
