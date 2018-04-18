import java.util.Scanner;
public class Fisherman {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String calculation = "";
      boolean repeat = true;
      do {
         displayWeeks();
         System.out.print("Another calculation? (Enter any key to continue or enter \"Q\" or \"q\" to quit): ");
         calculation = input.nextLine();
         repeat = (calculation.equals("Q") || calculation.equals("q")) ? false : true;
      } while(repeat); 
   }
   private static void displayWeeks() {
      Scanner input = new Scanner(System.in);
      int tunaTotal = 0;
      int bassTotal = 0;
      int halibutTotal = 0;
      int rockTotal = 0;
      double totalPrice = 0;
      for(int i = 1; i <= 4; i++) { 
         System.out.print("Number of tuna, bass, halibut, and rockfish for week " + i + ": ");
         int tuna = input.nextInt();
         int bass = input.nextInt();
         int halibut = input.nextInt();
         int rockfish = input.nextInt();
         tunaTotal += tuna < 0 ? 0 : tuna;
         bassTotal += bass < 0 ? 0 : bass;
         halibutTotal += halibut < 0 ? 0 : halibut;
         rockTotal += rockfish < 0 ? 0 : rockfish;
      }
      totalPrice = (15.95 * tunaTotal) + (9.5 * bassTotal) + (5.55 * halibutTotal) + (3.85 * rockTotal);
      System.out.println("After 4 weeks, you sold " + tunaTotal + " tuna, " + bassTotal + " bass, " + halibutTotal + " halibut, and " + rockTotal + " rockfish"); 
      System.out.printf("Total amount in 4 weeks: $%.2f\n", totalPrice);
      System.out.printf("Weekly average: $%.2f\n", (totalPrice/4));
      System.out.printf("Estimated end of year amount: $%.2f\n", ((totalPrice/4.00) * 52));
   }
}