//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: HW06 - Page 193 - #5.9)
//Class:                   CO SCI 290
//Date:                    03/21/2018
//Description:        Find the two highest scores
import java.util.Scanner;

public class HighestScoreTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program prompts the user to enter the number\n" +
                "of students and each student's name and score, and displays the name\n" +
                "of the student with the highest score and second highest score");
	     // Initial Variables
        System.out.print("Enter the number of students: ");
        int students = input.nextInt();
        int highestScore = 0;
        String highestName = "";
        int secondScore = 0;
        String secondName = "";
        System.out.println("Enter the student's name and score: ");
        // Loops through and finds highest score
        for (int i = 0; i < students; i++) {
            System.out.print("Student's name: ");
            String name = input.next();
            System.out.print(name + "'s score(whole number): ");
            int score = input.nextInt();
            if(score > highestScore) {
                secondScore = highestScore;
                highestScore = score;
                secondName = highestName;
                highestName = name;
            }
        }
        System.out.println("The highest score in the class belongs to: " + highestName + " with a score of: " + highestScore);
        System.out.println("The second highest score in the class belongs to: " + secondName + " with a score of: " + secondScore);

    }
}
