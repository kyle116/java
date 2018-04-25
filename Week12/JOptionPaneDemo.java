//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: LAB10 - Applet - Slide 16)
//Class:                   CO SCI 290
//Date:                    04/24/2018
//Description:        Number of Fruits
import javax.swing.JOptionPane;

public class JOptionPaneDemo {
   public static void main (String[] args) {
      String appleString = JOptionPane.showInputDialog ("Enter number of apples:");
      int appleCount = Integer.parseInt (appleString);
      String orangeString = JOptionPane.showInputDialog ("Enter number of oranges:");
      int orangeCount = Integer.parseInt (orangeString);
      int totalFruitCount = appleCount + orangeCount;
      JOptionPane.showMessageDialog (null, "The total number of fruits = " + totalFruitCount);
      System.exit (0);
   }
}