//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: HW06 - Page 193 - #5.8)
//Class:                   CO SCI 290
//Date:                    03/21/2018
//Description:        Find the highest score
import java.util.Scanner;

public class HighestScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program prompts the user to enter the number\n" +
                "of students and each student’s name and score, and displays the name\n" +
                "of the student with the highest score");
	// Initial Variables
        System.out.print("Enter the number of students: ");
        int students = input.nextInt();
        int highestScore = 0;
        String highestName = "";
        System.out.println("Enter the student's name and score: ");
	// Loops through and finds highest score
        for (int i = 0; i < students; i++) {
            System.out.print("Student's name: ");
            String name = input.next();
            System.out.print(name + "'s score(whole number): ");
            int score = input.nextInt();
            if(score > highestScore) {
                highestScore = score;
                highestName = name;
            }
        }
        System.out.println("The highest score in the class belongs to: " + highestName + " with a score of: " + highestScore);
    }
}
