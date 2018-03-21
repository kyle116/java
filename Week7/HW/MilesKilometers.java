//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: HW06 - Page 192 - #5.6)
//Class:                   CO SCI 290
//Date:                    03/21/2018
//Description:        Conversion from miles to kilometers

public class MilesKilometers {
    public static void main(String[] args) {
        System.out.println("This program displays Miles to Kilometers and Kilometers to Miles");
	// Initial Variables
        final double MILES_TO_KM = 1.609;
        System.out.println("Miles      Kilometers | Kilometers      Miles");
        int kilometersStart = 15;
	// Loop to print table
        for(int i = 1; i < 11; i+= 1) {
            if(kilometersStart < 515) {
                System.out.print(i + "                 " + ((int)(MILES_TO_KM * i * 1000)/1000.000) + " | ");
                System.out.println((kilometersStart += 5) + "             " + ((int)((kilometersStart / MILES_TO_KM) * 1000)/1000.000));
            }
        }
    }
}
