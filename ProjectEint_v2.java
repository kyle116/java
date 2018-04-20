import java.util.Scanner;
public class ProjectEint_v2 {
   public static void main(String[] args) {
      // Initial Variables
      String name="";
      String number="";
      String address="";
      String missingInfo="";
      String mainInput, customerInput, cardInput, mainSelection, optSelection;
      double total = 0;
      double mainPrice = 0;
      String mainString = "";
      double optPrice = 0;
      String optString = "";
      int optionCount = 0;
      String cardType = "";
      String cardNumber = "";
      Scanner keyboard = new Scanner(System.in);
      // Loop for Main Menu Selection
      do {
         displayMainMenu();
         mainInput = keyboard.nextLine();
         // Customer Information
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
            // Main Selection
            displayMainSelectionMenu();
            do {
               mainSelection = keyboard.next();
               // If user selects another main selection option, it will be subtracted from the total to prevent miscounting
               if(mainSelection.equals("1")) {
                  total -= mainPrice;
                  mainString = "";
                  mainPrice = 23.99;
                  mainString = "Economy ($23.99)\n";
               } else if(mainSelection.equals("2")) {
                  total -= mainPrice;
                  mainString = "";
                  mainPrice = 39.99;
                  mainString = "Compact ($39.99)\n";
               } else if(mainSelection.equals("3")) {
                  total -= mainPrice;
                  mainString = "";
                  mainPrice = 49.99;
                  mainString = "Standard ($49.99)\n";
               } else if(mainSelection.equals("4")) {
                  total -= mainPrice;
                  mainString = "";
                  mainPrice = 79.99;
                  mainString = "Premium ($79.99)\n";
               }
               total += mainPrice;
            } while(!(mainSelection.equals("5")));

         } else if (mainInput.equals("3")) {
             // Options
             displayOptionsMenu();
             double optPrice1 = 99.99;
             String optString1 = "Insurance ($99.99)\n";
             double optPrice2 = 14.99;
             String optString2 = "GPS ($14.99)\n";
             double optPrice3 = 9.99;
             String optString3 = "XM Radio ($9.99)\n";
             double optPrice4 = 19.99;
             String optString4 = "Child Seat ($19.99)\n";
             double optPrice5 = 39.99;
             String optString5 = "Full Tank of Gas ($39.99)\n";
             do {
               optSelection = keyboard.next();
               // To avoid repeat option selection, after option is selected, price and string of that option will become 0 and empty string
               if(optSelection.equals("1")) {
                  optPrice += optPrice1;
                  optString += optString1;
                  optionCount += optPrice1 > 0 ? 1 : 0;
                  optPrice1 = 0;
                  optString1 = "";
               } else if(optSelection.equals("2")) {
                  optPrice += optPrice2;
                  optString += optString2;
                  optionCount += optPrice2 > 0 ? 1 : 0;
                  optPrice2 = 0;
                  optString2 = "";
               } else if(optSelection.equals("3")) {
                  optPrice += optPrice3;
                  optString += optString3;
                  optionCount += optPrice3 > 0 ? 1 : 0;
                  optPrice3 = 0;
                  optString3 = "";
               } else if(optSelection.equals("4")) {
                  optPrice += optPrice4;
                  optString += optString4;
                  optionCount += optPrice4 > 0 ? 1 : 0;
                  optPrice4 = 0;
                  optString4 = "";
               } else if(optSelection.equals("5")) {
                  optPrice += optPrice5;
                  optString += optString5;
                  optionCount += optPrice5 > 0 ? 1 : 0;
                  optPrice5 = 0;
                  optString5 = "";
               } else if(optSelection.equals("6")) {
                  // This will clear any options
                  optString = "";
                  optPrice = 0;
               }
             } while(!(optSelection.equals("7")));
             total += optPrice;
            } else if (mainInput.equals("4")) {
                // Payment Mehtod
                do {
                    displayPaymentsMenu();
                    cardInput = keyboard.nextLine();
                    if(cardInput.equals("1")) {
                        cardType = "Visa";
                        System.out.print("Please enter your card number: ");
                        cardNumber = keyboard.nextLine();
                    } else if(cardInput.equals("2")) {
                        cardType = "MasterCard";
                        System.out.print("Please enter your card number: ");
                        cardNumber = keyboard.nextLine();
                    } else if(cardInput.equals("3")) {
                        cardType = "Cash";
                    }
                } while(!(cardInput.equals("4")));
            } else if(mainInput.equals("5")) {
                // Display Order Confirmation
                if(isOrderConplete(name, number, address, mainString, cardType, cardNumber)) {
                    displayOrder(name, number, address, total, mainString, optString, optionCount, cardType, cardNumber);
                } else {
                    displayErrors(name, number, address, mainString, cardType, cardNumber);
                }
            }
        } while(!(mainInput.equals("6")));
    }
    // Menus
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
    private static void displayOptionsMenu() {
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
    private static String getGift(int optionCount) {
        String giftString = "";
        if(optionCount == 2) {
            giftString = "$20 coupon for your next rental";
        } else if(optionCount == 3) {
            giftString = "$10 off at a local restaurant";
        } else if(optionCount >= 4) {
            giftString = "One free car wash";
        }
        return giftString;
    }
    // Displays order
    private static void displayOrder(String name, String number, String address, double total, String mainSelection, String optSelection, int optionCount, String cardType, String cardNumber) {
        String orderInfo = "You have placed an order for: \n";
        orderInfo = orderInfo + mainSelection + "With the following options:\n" + optSelection;
        // Calculates total with tax
        orderInfo += "\nTotal price: $" + ((double) Math.round(total * 1.0975 * 100)/100) + "\n\n";
        orderInfo += optionCount > 1 ? "Congratulations. You will get the following free gift with your order:\n" + (getGift(optionCount)) : "";
        orderInfo += "\nSold to: " + name;
        orderInfo += "\nTelephone: " + number;
        orderInfo += "\nAddress: " + address;
        orderInfo += "\nPaid by: " + cardType + (cardType != "Cash" ? " number" + cardNumber : "");

        System.out.println("\n" + orderInfo + "\n\n");
    }
    // Error display message
    private static void displayErrors(String name, String number, String address, String mainString, String cardType, String cardNumber) {
        String missingInfo = "\nPlease complete:\n";
        if(name.equals("")) {
            missingInfo += "Name\n";
        }
        if(number.equals("")) {
            missingInfo += "Phone Number\n";
        }
        if(address.equals("")) {
            missingInfo += "Address\n";
        }
        if(mainString.equals("")) {
            missingInfo += "Auto Type Selection\n";
        }
        if(cardType.equals("")) {
            missingInfo += "Card Type\n";
        }
        if(cardNumber.equals("")) {
            missingInfo += "Card Number\n";
        }
        System.out.println(missingInfo);
    }
    // Checks if there order is complete
    private static boolean isOrderConplete(String name, String number, String address, String mainString, String cardType, String cardNumber) {
        boolean status = true;
        if(name.equals("") || number.equals("") || address.equals("") || mainString.equals("") || cardType.equals("")) {
            status = false;
        } else if((cardType.equals("Visa") && cardNumber.equals("")) || (cardType.equals("Mastercard") && cardNumber.equals(""))) {
            // If Visa or Mastercard is selected and card number is blank, error. Cash will not care for card nummber
            status = false;
        }
        return status;
    }
}
