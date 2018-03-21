//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: LAB05 - Page 192 - #5.4)
//Class:                   CO SCI 290
//Date:                    03/13/2018
//Description:        Conversion from miles to kilometers

public class MilesToKilometeres {
    public static void main(String[] args) {
        System.out.println("This program shows a table that converts Miles to Kilometers up to 10 miles");
        final double MILES_TO_KM = 1.609;
        System.out.println("Miles Kilometers");
        for(int i = 1; i <= 10; i++) {
            System.out.println(i + "     " + (MILES_TO_KM * i));
        }
    }
}
