//Written by:           Kyle Liu & Mike Nunn & Alan Ortiz
//Assignment:         Assignment info (ex.: LAB06 - Page 193 - #5.15)
//Class:                   CO SCI 290
//Date:                    03/20/2018
//Description:        Display the ASCII character table


public class ASCIITable {
   public static void main(String[] args) {
      System.out.println("This program prints the characters in the ASCII character table from ! to ~");
      // Initial Variable
      double count = 1;
      char initialChar = '!';
      // Loop through ASCII characters from ! to ~ while ! is less than ~
      while(initialChar <= '~') {
         System.out.print((char)initialChar + " " + ((count % 10 == 0) ? "\n" : ""));
         count++;
         initialChar++;
      }
   }
}