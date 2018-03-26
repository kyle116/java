//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: LAB05 - Page 194 - #5.18)
//Class:                   CO SCI 290
//Date:                    03/21/2018
//Description:        Display four patterns using loops: pattern D

public class DisplayPatternsD {
    public static void main(String[] args) {
        System.out.println("This program uses nested loops that display patterns in four separate programs. This is program D");
        System.out.println("Pattern D");
        String strBuilder = "";
        int spacing = 0;
        for(int i = 1; i < 7; i++) {
            if(i != 1) {
                System.out.printf("%" + (spacing += 2) + "s", "");
            }
            for(int j = 1; j < (8 - i); j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
