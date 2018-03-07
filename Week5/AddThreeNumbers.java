//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: Lab03 - Page 108 - #3.2)
//Class:                   CO SCI 290
//Date:                    02/27/2018
//Description:        Game: add three numbers
import java.util.Scanner;

public class AddThreeNumbers {
    public static void main(String[] args) {
        System.out.println("Program will randomly generate an addition equation. Enter the correct answer");
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 7 % 10);
        int number3 = (int)(System.currentTimeMillis() / 10 % 10);

        Scanner input = new Scanner(System.in);
        System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + "? Please enter an integer");
        int answer = input.nextInt();

        System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + answer + " is " + (number1 + number2 + number3== answer));
    }
}
