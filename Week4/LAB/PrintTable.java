//Written by:           Kyle Liu & Raul Oregel 
//Assignment:         Assignment info (ex.: Lab03 - Page 73 - #2.18) 
//Class:                   CO SCI 290
//Date:                    02/27/2018
//Description:        Print a table

public class PrintTable {
   public static void main(String[] args) {
      int a = 1;
      int b = 2;
      int power = (int) Math.pow(a, b);
      System.out.println("a      b      pow(a, b)");
      System.out.println(a + "      " + b + "      " + power);
      a += 1;
      b += 1;
      power = (int) Math.pow(a, b);
      System.out.println(a + "      " + b + "      " + power);
      a += 1;
      b += 1;
      power = (int) Math.pow(a, b);
      System.out.println(a + "      " + b + "      " + power);
      a += 1;
      b += 1;
      power = (int) Math.pow(a, b);
      System.out.println(a + "      " + b + "      " + power);
      a += 1;
      b += 1;
      power = (int) Math.pow(a, b);
      System.out.println(a + "      " + b + "      " + power);
   }
}