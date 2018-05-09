//Written by:           Kyle Liu & Raul Oregel
//Assignment:         Assignment info (ex.: LAB12 - Page 277 - #7.4)
//Class:                   CO SCI 290
//Date:                    05/08/2018
//Description:        Analyze scores
import java.util.Scanner;

public class AnalyzeScores {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("This program reads an unspecified number of scores and determines how many scores are above or equal to the average and how many scores are below the average.");
      // Variables to keep track
      int[] scores = new int[100];
      int score;
      int index = 0;
      int total = 0; 
      int average = 0;
      int greater = 0;
      int less = 0;
      int equal = 0;
      // While input is greater than -1
      do {
         score = input.nextInt();
         scores[index] = score;
         index += 1;
      } while(score > 0);
      // For loop to go through until score it reaches -1
      // Calculates average
      for(int i = 0; scores[i] >= 0; i++) {
         total += scores[i];
      }
      average = total/(index - 1);
      
      // For loop to go through until score it reaches -1      
      // Calculates the count of greater than, less than or equal to average
      for(int i = 0; scores[i] >= 0; i++) {
         if(scores[i] > average) {
            greater += 1;
         } else if(scores[i] < average) {        
            less += 1;
         } else {
            equal += 1;
         }
      }
      System.out.println("The average is " + average + ". There are " + greater + " greater than the average and " + less + " less than the average. There are " + equal + " equal to the average.");
   }
}