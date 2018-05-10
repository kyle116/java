//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: HW12 - Page 279 - #7.15)
//Class:                   CO SCI 290
//Date:                    05/10/2018
//Description:        Eliminate duplicates
import java.util.Scanner;

public class EliminateDuplicates {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program reads in ten integers, invokes the method, and displays the result");

        int[] numbers = new int[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("The distinct numbers are: ");
        for (int i = 0; i < numbers.length; i++) {
            if(eliminateDuplicates(numbers)[i] >= 0) {
                System.out.print(eliminateDuplicates(numbers)[i] + " ");
            }
        }
    }

    public static int[] eliminateDuplicates(int[] list) {
        int[] newArr = new int[10];
        boolean unique = false;
        for(int k = 0; k < list.length; k++) {
            for(int l = 0; l < list.length; l++) {
                if(k != l && list[k] == list[l]) {
                    unique = false;
                    break;
                }
                unique = true;
            }
            newArr[k] = (unique ? list[k] : -1);
        }
        return newArr;
    }
}
