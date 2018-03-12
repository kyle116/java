//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: LAB05 - Page 111 - #3.15)
//Class:                   CO SCI 290
//Date:                    03/13/2018
//Description:        Lottery
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        System.out.println("This program will generate a random 3 digit number and you will input a 3 digit number to try and match, winnings\n will be dsplaed based on how many matches there are");
        // Generate a lottery number
        int lottery = (int)(Math.random() * 1000);

        // Prompt the user to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (three digits not separated by spaces): ");
        int guess = input.nextInt();

        // Get digits from lottery
        int lotteryDigit1 = lottery / 100;
        int lotteryDigit2 = lottery % 100 / 10;
        int lotteryDigit3 = lottery % 10;

        // Get digits from guess
        int guessDigit1 = guess / 100;
        int guessDigit2 = guess % 100/ 10;
        int guessDigit3 = guess % 10;

        System.out.println("The lottery number is " + (lottery < 100 ? "0" + lottery : lottery));

        // Check the guess
        if (guess == lottery)
            System.out.println("Exact match: you win $10,000");
        else if ((guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit3)
                || (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit1)
                || (guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit2)
                || (guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit2 && guessDigit3 == lotteryDigit1)
                || (guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit2))
            System.out.println("Match all digits: you win $3,000");
        else if (guessDigit1 == lotteryDigit1
                || guessDigit1 == lotteryDigit2
                || guessDigit1 == lotteryDigit3
                || guessDigit2 == lotteryDigit1
                || guessDigit2 == lotteryDigit2
                || guessDigit2 == lotteryDigit3
                || guessDigit3 == lotteryDigit1
                || guessDigit3 == lotteryDigit2
                || guessDigit3 == lotteryDigit3)
            System.out.println("Match one digit: you win $1,000");

        else
            System.out.println("Sorry, no match");
    }
}