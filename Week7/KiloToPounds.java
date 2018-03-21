//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: LAB05 - Page 192 - #5.3)
//Class:                   CO SCI 290
//Date:                    03/13/2018
//Description:        Conversion from kilograms to pounds

public class KiloToPounds {
    public static void main(String[] args) {
        System.out.println("This program shows a table that converts Kilograms to Pounds up to 199 kilograms");
        final double KILO_TO_POUNDS = 2.2;
        System.out.println("Kilograms Pounds");
        for(int i = 1; i < 200; i++) {
            System.out.println(i + "        " + (KILO_TO_POUNDS * i));
        }
    }
}
