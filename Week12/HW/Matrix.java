//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: HW10 - Page 238 - #6.17)
//Class:                   CO SCI 290
//Date:                    04/25/2018
//Description:        Display matrix of 0s and 1s
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program prompts the user to enter n and displays an n-by-n matrix");
        System.out.print("Enter n: ");
        int rows = input.nextInt();
        printMatrix(rows);
    }
    public static void printMatrix(int n) {
        // loop for columns use n as many columns
        for(int column = 0; column < n; column++) {
            // loop for rows use n as many rows
            for(int row = 0; row < n; row++) {
                System.out.print((int)(Math.random() * 2) + " ");
            }
            System.out.println("");
        }
    }
}
