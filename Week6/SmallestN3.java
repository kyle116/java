//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: LAB05 - Page 193 - #5.13)
//Class:                   CO SCI 290
//Date:                    03/20/2018
//Description:        Find the smallest n such that n^3 < 12,000

public class SmallestN3 {
    public static void main(String[] args) {
        System.out.println("This program uses a while loop to find the largest  integer n such that n3 is less than 12,000.");
        int n = 0;
        while((n + 1) * (n + 1) * (n + 1) < 12000) {
            n += 1;
        }
        System.out.println("The largest integer n such that n3 is less than 12,000 " + n);
    }
}
