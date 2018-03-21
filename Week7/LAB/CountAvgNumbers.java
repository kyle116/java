//Written by:           Kyle Liu & Mike Nunn & Alan Ortiz
//Assignment:         Assignment info (ex.: LAB06 - Page 192 - #5.1)
//Class:                   CO SCI 290
//Date:                    03/20/2018
//Description:        Count positive and negative numbers and compute the average of numbers
import java.util.Scanner;

public class CountAvgNumbers {
    public static void main(String[] args) {
        System.out.println("This program reads an unspecified number of integers, it will determine how many\n" +
                "positive and negative values there are, and computes the total and average of\n" +
                "the input values (not counting zeros)");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer, the input ends if it is 0: ");
        // Initial Variables
        int numbers;
        int count = 0;
        int positives = 0;
        int negatives = 0;
        double total = 0;
        float average;
        // While Loop Until Input receives 0
        do {
            numbers = input.nextInt();
            count++;
            total += numbers;
            if(numbers > 0) {
                positives++;
            }
            if(numbers < 0) {
                negatives--;
            }
        } while(numbers != 0);
        average = (float)total / count;
        
        // Print output
        System.out.println("The number of positives is " + positives);
        System.out.println("The number of negatives is " + negatives);
        System.out.println("The total is " + total);
        System.out.println("The average is " + average);
    }
}
