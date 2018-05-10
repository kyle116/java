//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: HW12 - Page 278 - #7.12)
//Class:                   CO SCI 290
//Date:                    05/10/2018
//Description:        Reverse an array
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program prompts the user to \n" +
                "enter ten numbers, invokes the method to reverse the numbers, and displays the\n" +
                "numbers");

        System.out.print("Enter 10 numbers: ");
        int[] numbers = new int[10];
        for(int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.println("The array reversed is ");
        for(int i = 0; i < 10; i++) {
            System.out.print(reverse(numbers)[i] + " ");
        }

    }


    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];

        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }

        return result;
    }
}
