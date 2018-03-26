//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: LAB05 - Page 194 - #5.18)
//Class:                   CO SCI 290
//Date:                    03/21/2018
//Description:        Display four patterns using loops: pattern C

public class DisplayPatternsC {
    public static void main(String[] args) {
        System.out.println("This program uses nested loops that display patterns in four separate programs. This is program C");
        System.out.println("Pattern C");
        String strBuilder = "";
        int spacing = 10;
        for(int i = 1; i < 7; i++) {
            for(int j = 6; j > 0; j--) {
                if(j == 6 && i == 1) {
                    System.out.printf("%" + (spacing) + "s", "");
                } else if(j == 6 && j - i != 0) {
                    System.out.printf("%" + (spacing -= 2) + "s", "");
                }
                System.out.print((j <= i ? j + " " : ""));
            }
            System.out.println("");
        }
    }
}
