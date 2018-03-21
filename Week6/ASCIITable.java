//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: LAB05 - Page 193 - #5.15)
//Class:                   CO SCI 290
//Date:                    03/20/2018
//Description:        Display the ASCII character table


public class ASCIITable {
      
   public static void main(String[] args) {
      int j = 'D';
      double count = 0;
      for(int i = '!'; i <= '~'; i++) {
         count += 1;
         System.out.print((char)i + " " + ((count % 10 == 0) ? "\n" : ""));
      }
   }
}