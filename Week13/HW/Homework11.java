//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: HW11)
//Class:                   CO SCI 290
//Date:                    05/02/2018
//Description:        Create 3 methods for an array

public class Homework11 {
    public static void main(String[] args) {
        System.out.println("This program reads a list of 10 integers defined by the programmer and calculates average of all numbers, average of odd numbers, and average of even numbers.");
        // Starting array
        int a[] = { 3, -2, 0, 1, 100, 10, 94, 7, 76, 3, 678};
        System.out.println("Average of all numbers: " + regularAvg(a) + ". Average of all odd numbers: " + oddAvg(a) + ". Average of all even numbers: " + evenAvg(a));
    }
    // Method for all numbers average
    public static double regularAvg (int arr[]) {
        double total = 0;
        for(int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total / arr.length;
    }
    // Method for odd numbers average
    public static double oddAvg (int arr[]) {
        double total = 0;
        // count how many odd numbers are in the array
        int oddCount = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 1) {
                total += arr[i];
                oddCount += 1;
            }
        }
        return total / oddCount;
    }
    // Method for even numbers average
    public static double evenAvg (int arr[]) {
        double total = 0;
        // count how many even numbers are in the array
        int evenCount = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                total += arr[i];
                evenCount += 1;
            }
        }
        return total / evenCount;
    }
}
