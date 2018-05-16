import java.util.Scanner;
public class Project2 {
   final static int MAX_ACCOUNTS = 10;
   
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String input1 = "";
      String input2 = "";
      
      double[] saving = new double[MAX_ACCOUNTS];
      double[] checking = new double[MAX_ACCOUNTS];
      String[] pin = new String[MAX_ACCOUNTS];
      
      int numberOfAccounts = 5;
      int active_account = -1;
      int numberAttempts = 0;
      populateArrays(saving, checking, pin);
      
      do {
         menu1();
         input1 = input.nextLine();
         if(input1.equals("1")) {
            do {
               menu2();
               input2 = input.nextLine();
               if(input2.length() != 4) {
                  System.out.println("Invalid entry, please enter 4 digits");
               } else {
                  active_account = checkPIN(input2, numberOfAccounts, pin, active_account);
                  if(active_account > -1) {
                     System.out.println("CORECT PIN. Active Account: " + active_account);
                     break;
                  } else {
                     if(numberAttempts == 2) {
                        System.out.println("Too many illegal attempts. Try again later.");
                     } else {
                        System.out.println("Incorrect PIN, please try again");
                     }
                     numberAttempts += 1;
                  }
               }
            } while(numberAttempts < 3);
            
         } else if(input2.equals("2")) {
            numberAttempts = 0;
            active_account = -1;
         }
      } while(!(input1.equals("3")));
      
      
      active_account = 0;
      System.out.println(saving[active_account]);
      System.out.println(checking[active_account]);
      System.out.println(pin[active_account]);
   }
   
   public static void populateArrays(double[] saving, double[] checking, String[] pin) {
      saving[0] = 1000;
      checking[0] = 1000;
      pin[0] = "1111";
      
      saving[1] = 2000;
      checking[1] = 2000;
      pin[1] = "3000";
      
      saving[2] = 7912;
      checking[2] = 6510;
      pin[2] = "9616";
      
      saving[3] = 9011;
      checking[3] = 78541;
      pin[3] = "4151";
      
      saving[4] = 494;
      checking[4] = 33;
      pin[4] = "4504";
   }
   
   private static void menu1() {
      System.out.println("*** Welcome to ELACATM ***\n" +
         "1. Input PIN\n" +
         "2. Clear\n" +
         "3. Exit\n"); 
   }
   
   private static void menu2() {
      System.out.println("Please input your pin:"); 
   }

   private static int checkPIN(String custPinInput, int numberOfAccounts, String[] pin, int active_account) {
      for(int i = 0; i < numberOfAccounts; i++) {
         if(pin[i].equals(custPinInput)) {
            return active_account = i;
         }
      }
      return -1;
   }
   
   private static void withdraw() {
   
   }
   
   private static void deposit() {
   
   }
   
   private static void transfer() {
   
   }
   
   private static void balanceInquiry() {
   
   }
}