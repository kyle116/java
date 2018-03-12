//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: HW04 - Page 110 - #3.8)
//Class:                   CO SCI 290
//Date:                    03/07/2018
//Description:        Sort three integers
import java.util.Scanner;

public class SortThreeIntegers {
    public static void main(String[] args) {
        System.out.println("This program takes in three integers and display the integers in non-decreasing order.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 integers seperated by spaces: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        if(num1 > num2 && num1 > num3) {
            if(num2 > num3) {
                System.out.println("Non-decreasing order: " + num3 + " " + num2 + " " + num1);
            }
            if(num3 > num2) {
                System.out.println("Non-decreasing order: " + num2 + " " + num3 + " " + num1);
            }
        }
        if(num2 > num1 && num2 > num3) {
            if(num1 > num3) {
                System.out.println("Non-decreasing order: " + num3 + " " + num1 + " " + num2);
            }
            if(num3 > num1) {
                System.out.println("Non-decreasing order: " + num1 + " " + num3 + " " + num2);
            }
        }
        if(num3 > num1 && num3 > num2) {
            if(num1 > num2) {
                System.out.println("Non-decreasing order: " + num2 + " " + num1 + " " + num3);
            }
            if(num2 > num1) {
                System.out.println("Non-decreasing order: " + num1 + " " + num2 + " " + num3);
            }
        }
    }
}
