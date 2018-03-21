//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: HW06 - Page 193 - #5.10)
//Class:                   CO SCI 290
//Date:                    03/21/2018
//Description:        Find numbers divisible by 5 and 6

public class Divisible5And6 {
    public static void main(String[] args) {
        System.out.println("This program displays all numbers divided by 5 and 6 between 100 to 1000");
        System.out.println("These are the numbers divisible by 5 and 6: ");
	// Initial Variables
        String listOfNumbers = "";
        int counter = 0;
	// Loop through 100 and 1000
        for(int i = 100; i <= 1000; i++) {
	    // If divisible by 5 and 6
            if(i % 5 == 0 && i % 6 == 0) {
                listOfNumbers += i + " ";
                counter++;
                if(counter % 10  == 0) {
                    System.out.println(listOfNumbers);
                    listOfNumbers = "";
                } else if(i == 1000) {
                    System.out.println(listOfNumbers);
                }
            }

        }
    }
}
