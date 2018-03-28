import java.util.Scanner;
public class ProjectEint_v2 {
	public static void main(String[] args) {
      String name="";
      String number="";
      String address="";
      String missingInfo="";
      String mainInput, customerInput;
			int mainSelection, optSelection;
			double total = 0;
			double mainPrice = 0;
			String mainString = "";
			double optPrice = 0;
			String optString = "";
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
               } else if(customerInput.equals("2")) {
		              number = getNumber();
	             } else if(customerInput.equals("3")) {
		              address = getAddress();
	             }
            } while(!(customerInput.equals("4")));
         } else if (mainInput.equals("2")) {
					 displayMainSelectionMenu();
					 mainSelection = keyboard.nextInt();
			 		 switch(mainSelection) {
		 			   case 1: total -= mainPrice; // If customer selects "2" a second time, will clear out previous selection
						 				 mainString = "";
						 			 	 mainPrice = 23.99;
						 				 mainString = "Economy ($23.99)";
		 				 				 break;
		 				 case 2: total -= mainPrice;
										 mainString = "";
										 mainPrice = 39.99;
						 				 mainString = "Compact ($39.99)";
		 				  			 break;
		 				 case 3: total -= mainPrice;
										 mainString = "";
										 mainPrice = 49.99;
						 				 mainString = "Standard ($49.99)";
		 				  			 break;
		 				 case 4: total -= mainPrice;
										 mainString = "";
										 mainPrice = 79.99;
						 				 mainString = "Premium ($79.99)";
		 			  				 break;
		 	 			 case 5: break;
			 		 }
					 total += mainPrice;
		 			// return retPrice;
         } else if (mainInput.equals("3")) {
					 displayOptionsMenu();
		 			 do {
			 				optSelection = keyboard.nextInt();
			 				switch(optSelection) {
			 					case 1: optPrice += 99.99;
												optString += "Insurance ($99.99)\n";
			 									break;
			 					case 2: optPrice += 14.99;
												optString += "GPS ($14.99)\n";
			 									break;
			 					case 3: optPrice += 9.99;
												optString += "XM Radio ($9.99)\n";
			 									break;
			 					case 4: optPrice += 19.99;
												optString += "Child Seat ($19.99)\n";
			 									break;
			 					case 5: optPrice += 39.99;
												optString += "Full Tank of Gas ($39.99)\n";
			 									break;
			 					case 6: optString = "";
												optPrice = 0;
			 									break;
			 					case 7: break;
			 				}
		 			 } while(optSelection != 7);
		 			// return optPrice;
					total += optPrice;
         }  else if (mainInput.equals("4")) {
					 do {
							displayPaymentsMenu();
							customerInput = keyboard.nextLine();
							if(customerInput.equals("1")) {
								 name = getName();
							} else if(customerInput.equals("2")) {
								 number = getNumber();
							} else if(customerInput.equals("3")) {
								 address = getAddress();
							}
					 } while(!(customerInput.equals("4")));
         } else if(mainInput.equals("5")) {
					 displayOrder(name, total, mainString); // Remove
            if(isOrderConplete(name)) {
							 displayOrder(name, total, mainString);
            } else {
               displayErrors(name);
            }
         }
      } while(!(mainInput.equals("6")));
   }

   private static String getName() {
      String name = "";
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter customer name: ");
      name = keyboard.nextLine();
      return name;
   }
   private static String getNumber() {
      String number = "";
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter customer phone number: ");
      number = keyboard.nextLine();
      return number;
   }
	 private static String getAddress() {
      String address = "";
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter customer address: ");
      address = keyboard.nextLine();
      return address;
   }
   private static void displayMainMenu() {
      System.out.println();
      System.out.println("1. Input Customer Information\n" +
			                   "2. Main Selection\n" +
			                   "3. Options\n" +
			                   "4. Payment Method\n" +
                         "5. Display Order Confirmation\n" +
                         "6. Exit");
      System.out.print("\nYour selection: ");
    }
   private static void displayCustomerMenu() {
      System.out.println();
      System.out.println("1. Name\n" +
                         "2. Phone Number\n" +
                         "3. Address\n" +
                         "4. Main Menu\n");
      System.out.print("\nYour selection: ");
   }
	 private static void displayMainSelectionMenu() {
      System.out.println();
      System.out.println("1. Economy ($23.99)\n" +
                         "2. Compact ($39.99)\n" +
                         "3. Standard ($49.99)\n" +
												 "4. Premium ($79.99)\n" +
                         "5. Main Menu\n");
      System.out.print("\nMake your selection(1-5): ");
   }
	 private static double displayOptionsMenu() {

      System.out.println();
      System.out.println("1. Insurance ($99.99)\n" +
                         "2. GPS ($14.99)\n" +
                         "3. XM Radio ($9.99)\n" +
                         "4. Child Seat ($19.99)\n" +
                         "5. Full Tank of Gas ($39.99)\n" +
                         "6. Clear Options\n" +
                         "7. Main Menu\n");
      System.out.print("\nYour selection: ");

   }
	 private static void displayPaymentsMenu() {
      System.out.println();
      System.out.println("1. Visa\n" +
                         "2. Mastercard\n" +
                         "3. Cash\n" +
                         "4. Main Menu\n");
      System.out.print("\nYour selection: ");
   }
   private static void displayOrder(String name, double total, String mainSelection) {
		 System.out.print(total + " " + mainSelection);
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
