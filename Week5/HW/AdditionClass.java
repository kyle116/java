//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: HW04 - Page 110 - #3.10)
//Class:                   CO SCI 290
//Date:                    03/07/2018
//Description:        Game: addition quiz
import java.util.Scanner;

public class AdditionClass {
    public static void main(String[] args) {
        System.out.println("Program will randomly generate an addition equation. Enter the correct answer");
        // 1. Generate two random single-digit integers
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        // 2. If number1 < number2, swap number1 with number2
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        // 3. Prompt the student to answer ”What is number1 – number2?”
        System.out.print("What is " + number1 + " + " + number2 + "? Please enter an integer ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        // 4. Grade the answer and display the result
        if (number1 + number2 == answer) {
            System.out.println("You are correct!");
        } else {
            System.out.println("Your answer is wrong.");
            System.out.println(number1 + " + " + number2 + " should be " + (number1 + number2));
        }
    }
}
