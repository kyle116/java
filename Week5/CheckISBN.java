//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: Lab03 - Page 110 - #3.9)
//Class:                   CO SCI 290
//Date:                    02/27/2018
//Description:        Business: check ISBN-10
import java.util.Scanner;

public class CheckISBN {
    public static void main(String[] args) {
        System.out.println("Program will display correct ISBN number based on the ISBN provided.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int isbn = input.nextInt();
        int d1 = isbn / 100000000;
        int d2 = (isbn % 100000000) / 10000000;
        int d3 = (isbn % 10000000) / 1000000;
        int d4 = (isbn % 1000000) / 100000;
        int d5 = (isbn % 100000) / 10000;
        int d6 = (isbn % 10000) / 1000;
        int d7 = (isbn % 1000) / 100;
        int d8 = (isbn % 100) / 10;
        int d9 = (isbn % 10);
        int d10 = (d1*1 + d2*2 + d3*3 + d4*4 + d5*5 + d6*6 + d7*7 + d8*8 + d9*9) % 11;
        System.out.print("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9);
        if (d10 == 10) {
            System.out.println("X");
        } else {
            System.out.println(d10);
        }
    }
}
