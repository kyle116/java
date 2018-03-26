//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: LAB05 - Page 194 - #5.18)
//Class:                   CO SCI 290
//Date:                    03/21/2018
//Description:        Display four patterns using loops: pattern B

public class DisplayPatternsB {
    public static void main(String[] args) {
        System.out.println("This program uses nested loops that display patterns in four separate programs. This is program B");
        System.out.println("Pattern B");
        String strBuilder = "";
        for(int i = 1; i < 7; i++) {
            for(int j = 1; j < (8 - i); j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
