//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: LAB05 - Page 192 - #5.5)
//Class:                   CO SCI 290
//Date:                    03/13/2018
//Description:        Conversion from kilograms to pounds and pounds to kilograms

public class KilogramsPounds {
    public static void main(String[] args) {
        System.out.println("This program displays Kilograms to pounds and pounds to kilograms");
        final double KILO_TO_POUNDS = 2.2;
        System.out.println("Kilograms Pounds | Pounds Kilograms");
        int poundsStart = 15;
        for(int i = 1; i < 200; i+= 2) {
            if(poundsStart < 515) {
                System.out.print(i + "           " + ((int)(KILO_TO_POUNDS * i * 10)/10.0) + " | ");
                System.out.println((poundsStart += 5) + "       " + ((int)((poundsStart / KILO_TO_POUNDS) * 10)/10.0));
            }
        }
    }
}
