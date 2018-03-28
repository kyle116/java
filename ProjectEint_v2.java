import java.util.Scanner;
public class ProjectEint_v2 {
	public static void main(String[] args) {
      String name="";
      String missingInfo="";
      String mainInput, customerInput;
      Scanner keyboard = new Scanner(System.in);
      do {
         displayMainMenu();
         mainInput = keyboard.nextLine();
         if(mainInput.equals("1")) {
            do {
               displayCustomerMenu();
               customerInput = keyboard.nextLine();
               if(customerInput.equals("1")) {
                  name = getName();
               } 
            } while(!(customerInput.equals("2")));  
         } else if (mainInput.equals("2")) {
            if(isOrderConplete(name)) {
               displayOrder(name);
            } else {
               displayErrors(name);
            }
         }
      } while(!(mainInput.equals("3")));
   }

   private static String getName() {
      String name = "";
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter customer name: ");
      name = keyboard.nextLine();
      return name;
   }
   private static void displayMainMenu() {
      System.out.println();
      System.out.println("1. Input Customer Information\n" +
                         "2. Display Order Confirmation\n" +
                         "3. Exit");
      System.out.print("\nYour selection: ");
    }
   private static void displayCustomerMenu() {
      System.out.println();
      System.out.println("1. Name\n" +
                         "2. Telephone Number\n" +
                         "3. Address" +
                         "4. Main Menu\n");
      System.out.print("\nYour selection: ");
   }
   private static void displayOrder(String name) {
      String orderInfo = "\nName: " + name;
      System.out.println("\n" + orderInfo + "\n");
   }
   private static void displayErrors(String name) {
      String missingInfo = "\nPlease complete:\n";
      if(name.equals("")) {
         missingInfo += "Name\n";
      }
      System.out.println(missingInfo);
   }
   private static boolean isOrderConplete(String name) {
      boolean status = true;
      if(name.equals("")) {
         status = false;
      }
      return status;
   }
}


