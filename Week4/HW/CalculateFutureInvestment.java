//Written by:           Kyle Liu & Raul Oregel
//Assignment:         Assignment info (ex.: HW03 - Page 74 - #2.21)
//Class:                   CO SCI 290
//Date:                    02/27/2018
//Description:        Financial application: calculate future investment value
import java.util.Scanner;

public class CalculateFutureInvestment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double monthlyInterestRate = input.nextDouble()/1200;
        System.out.print("Enter number of years: ");
        int numberOfYears = input.nextInt();
        System.out.println("Accumulated value is " + (investmentAmount * Math.pow((1 + monthlyInterestRate), numberOfYears*12)));
    }
}
