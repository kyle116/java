//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: Lab03 - Page 110 - #3.12)
//Class:                   CO SCI 290
//Date:                    02/27/2018
//Description:        Palindrome number
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Program prompts to enter a three-digit integer and determines whether it is a palindrome number. A number is palindrome if it reads the same from right to left and from left to right");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");
        Integer number = input.nextInt();
        String numberReversed = "";
        int digit1 = number/100;
        int digit2 = (number/10) % 10;
        int digit3 = number % 10;

        String numStr = number.toString();
        numberReversed = numberReversed + digit3 + digit2 + digit1;
        if(numStr.equals(numberReversed)) {
            System.out.println(number + " is a palindrome");
        } else {
            System.out.println(number + " is not a palindrome");
        }
    }
}
