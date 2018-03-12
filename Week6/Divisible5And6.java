//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: LAB05 - Page 193 - #5.10)
//Class:                   CO SCI 290
//Date:                    03/13/2018
//Description:        Find numbers divisible by 5 and 6

public class Divisible5And6 {
    public static void main(String[] args) {
        System.out.println("This program displays all numbers divided by 5 or 6 between 100 to 1000 but not divisible by both 5 and 6");
        System.out.println("These are the numbers divisible by 5 or 6: ");
        String listOfNumbers = "";
        int counter = 0;
        for(int i = 100; i <= 1000; i++) {
            if(i % 5 == 0 && i % 6 == 0) {
                continue;
            } else if(i % 5 == 0 || i % 6 == 0) {
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
