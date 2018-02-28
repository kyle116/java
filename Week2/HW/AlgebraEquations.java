//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: Lab01 - Page 31 - #1.13) 
//Class:                   CO SCI 290
//Date:                    02/14/2018
//Description:        Algebra: solve 2 * 2 linear equations

public class AlgebraEquations {
   public static void main(String[] args) {
      System.out.println("Cramer’s rule:");
      System.out.println("ax + by = e");
      System.out.println("cx + dy = f");
      System.out.println("x = ed - bf");
      System.out.println("    -------");
      System.out.println("    ad - bc");
      System.out.println("y = af - ec");
      System.out.println("    -------");
      System.out.println("    ad - bc");
      System.out.println("3.4x + 50.2y = 44.5");
      System.out.println("2.1x +  .55y =  5.9");
		System.out.println("x = (44.5 * .55) - (50.2 * 5.9)");
		System.out.println("    ---------------------------");
		System.out.println("    (3.4  * .55) - (50.2 * 2.1)");
		System.out.println("x = " + (((44.5 * .55) - (50.2 * 5.9)) / ((3.4 * .55) - (50.2 * 2.1))));
		System.out.println("y = (3.4 * 5.9) - (44.5 * 2.1)");
		System.out.println("    ---------------------------");
		System.out.println("    (3.4 * .55) - (50.2 * 2.1)");
		System.out.println("y = " + (((3.4 * 5.9) - (44.5 * 2.1)) / ((3.4 * .55) - (50.2 * 2.1))));
   }
}