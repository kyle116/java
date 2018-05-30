//Written by:           Kyle Liu
//Assignment:         Final Exam
//Class:                   CO SCI 290
//Date:                    05/29/2018
//Description:        Final Exam

public class FinalExam {

   public static void main(String[] args) {
      String[] sampleArray = getInfo();
      // Displays the content of the original array
      System.out.println("Original List:");
      displayNames(sampleArray);
      System.out.println("");
      
      // Displays the returnWord method
      System.out.println("Running the return one word method with argument of the first element \n" +
         "in the array and integer of 1 gives us: " + returnWord(sampleArray[0], 1));
      System.out.println("");
      
      // Displays only names
      System.out.println("Names:");
      properFormatAge(sampleArray, 0, false);
      System.out.println("");
      
      // Displays the names in proper format
      System.out.println("Proper format with default age");
      properFormatAge(sampleArray, 0, true);
      System.out.println("");
      
      // Displays the name in proper format followed by age in 10 years
      System.out.println("Age after 10 years");
      properFormatAge(sampleArray, 10, true);
   }
   
   public static String[] getInfo() {
      String[] list = new String[] {"lisA 23", "JaMes 47", "ROBERT 18", "Mary 30", "KYle 24"};
      return list;
   }
   
   public static void displayNames(String[] names) {
      // Loops and pritns out names from array
      for(int i = 0; i < names.length; i++) {
         System.out.println(names[i]);
      }
   }
   
   public static String returnWord(String words, int number) {
      // Splits the 2 words into an array
      String[] wordArr = words.split(" ");
      String retWord = "";
      // Depending on argument passed in, word will be returned
      if(number == 1) {
         retWord = wordArr[0];
      } else if(number == 2) {
         retWord = wordArr[1];
      }
      return retWord;
   }
   
   public static void properFormatAge(String[] words, int increase, boolean ageDisplay) {
      // Loops through array
      for(int i = 0; i < words.length; i++) {
         // Calls returnWord to get the age
         int newAge = Integer.parseInt(returnWord(words[i], 2));
         // substring(0,1) gets the first letter. substring(1) gets everything from position 1 and on.
         words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
         
         // Increases age if int is passed into method
         if(increase > 0) {
            newAge = newAge + increase;
         }
         
         // Prints out the name then the age
         System.out.println(returnWord(words[i], 1) + (ageDisplay ? " " + newAge : ""));
      }
   }
   
}