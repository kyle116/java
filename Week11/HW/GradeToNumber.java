//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: HW07 - Page 154 - #4.14)
//Class:                   CO SCI 290
//Date:                    04/20/2018
//Description:        Convert letter grade to number
import java.util.Scanner;

public class GradeToNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program prompts the user to enter a letter grade A, B, C, D, or F and displays its corresponding numeric value 4, 3, 2, 1, or 0");

        System.out.print("Enter a letter grade: ");
        String grade = input.nextLine();

	// Convert input to character to compare
        char gradeChar = grade.charAt(0);
        gradeChar = Character.toUpperCase(gradeChar);

	// Switch to determine Number
        switch(gradeChar) {
            case 'A':
                System.out.println("The numeric value for grade " + gradeChar + " is 4");
                break;
            case 'B':
                System.out.println("The numeric value for grade " + gradeChar + " is 3");
                break;
            case 'C':
                System.out.println("The numeric value for grade " + gradeChar + " is 2");
                break;
            case 'D':
                System.out.println("The numeric value for grade " + gradeChar + " is 1");
                break;
            case 'F':
                System.out.println("The numeric value for grade " + gradeChar + " is 0");
                break;
            default:
                System.out.println(gradeChar + " is an invalid grade");
        }
    }
}
