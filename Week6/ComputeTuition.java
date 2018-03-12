//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: LAB05 - Page 193 - #5.7)
//Class:                   CO SCI 290
//Date:                    03/13/2018
//Description:        Financial application: compute future tuition

public class ComputeTuition {
    public static void main(String[] args) {
        System.out.println("This program computes the tuition in ten years and the\n" +
                "total cost of four years’ worth of tuition after the tenth year");
        int tuition = 10000;
        int tuitionTen = 0;
        int tuitionFour = 0;
        for(int i = 1; i < 15; i++) {
            tuition *= 1.05;
            if(i == 10) {
                tuitionTen = tuition;
            }
            if (i > 10) {// Test for after 10 years
                tuitionFour += tuition;
            }
//            tuitionFour = tuition - tuitionTen;
        }
        System.out.println("Tuition after 10 years is: $" + tuitionTen);
        System.out.println("4 year tuition after 10 years is: $" + tuitionFour);
    }
}
