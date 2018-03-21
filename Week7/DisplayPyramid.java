//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: LAB05 - Page 193 - #5.17)
//Class:                   CO SCI 290
//Date:                    03/21/2018
//Description:        Display pyramid
import java.util.Scanner;

public class DisplayPyramid {
    public static void main(String[] args) {
        System.out.println("This program prompts the user to enter an integer from\n" +
                "1 to 15 and displays a pyramid");
        // Initial Variables
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines(1-15): ");
        int lines = input.nextInt();
        int start = lines >= 10 ? (lines + 2) * 2 : (lines - 1) * 2;
        String printStr = "";
        // Loop to build string pyramid
        for(int i = 1; i <= lines; i++) {
            if(i == 1) {
                printStr += i;
            } else {
                start -= i >= 10 ? 3 : 2;
                printStr = i + " " + printStr + " " + i;
            }
            System.out.printf((start != 0 ? "%" + start + "s" : "") + printStr + "\n", "");
        }
    }
}
