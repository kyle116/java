//Written by:           Kyle Liu & Raul Oregel
//Assignment:         Assignment info (ex.: LAB11 - Page 276 - #7.1)
//Class:                   CO SCI 290
//Date:                    05/01/2018
//Description:        Assign grades
import java.util.Scanner;
import java.util.Arrays;

public class AssignGrades {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("This program reads student scores, gets the best score,and then assigns grades");
      
      // User input variables
      System.out.print("Enter the number of students: ");
      int students = input.nextInt();
      
      int[] grades = new int[students];
      int best = 0;
      System.out.print("Enter " + students + " scores: ");
      // Loop through amount of students and take in user input for their scores
      for(int i = 0; i < students; i++) {
         int gd = input.nextInt();
         grades[i] = gd;
         best = (best < grades[i] ? grades[i] : best);
      }
      
      // logic for determining each grade
      for(int i = 0; i < students; i++) {
         String letterGrade = "";
         if(grades[i] >= best - 10) {
            letterGrade = "A";
         } else if(grades[i] >= best - 20 && grades[i] < best - 10) { 
            letterGrade = "B";
         } else if(grades[i] >= best - 30 && grades[i] < best - 20) { 
            letterGrade = "C";
         } else if(grades[i] >= best - 40 && grades[i] < best - 30) { 
            letterGrade = "D";
         } else {
            letterGrade = "F";
         }
         System.out.println("Student " + i + " score is " + grades[i] + " and grade is " + letterGrade);
      }
   }
}