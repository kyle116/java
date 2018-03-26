//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: LAB05 - Page 194 - #5.18)
//Class:                   CO SCI 290
//Date:                    03/21/2018
//Description:        Display four patterns using loops: pattern A

public class DisplayPatternsA {
    public static void main(String[] args) {
        System.out.println("This program uses nested loops that display patterns in four separate programs. This is program A");
        System.out.println("Pattern A");
        String strBuilder = "";
        for(int i = 1; i < 7; i++) {
            for(int j = 1; j < (i + 1); j++) {
                System.out.print(j + " ");
            }
            System.out.println("");;
        }
    }
}
