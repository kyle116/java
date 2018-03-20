//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: LAB05 - Page 193 - #5.12)
//Class:                   CO SCI 290
//Date:                    03/20/2018
//Description:        Find the smallest n such that n^2 > 12,000

public class SmallestN2 {
    public static void main(String[] args) {
        System.out.println("This program uses a while loop to find the smallest integer n such that n2 is greater than 12,000");
        int n = 0;
        while(n * n < 12000) {
            n += 1;
        }
        System.out.println("The smallest integer n such that n2 is greater than 12,000 is " + n);
    }
}
