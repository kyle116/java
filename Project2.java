import java.util.Scanner;

public class Project2 {
    final static int MAX_ACCOUNTS = 10;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String input1 = "";
        String input2 = "";
        String input3 = "";
        String withdrawInput = "";
        String checkingOrSavings = "";
        String otherWithdraw = "";

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
                            do {
                                menu3();
                                input3 = input.nextLine();
                                // Withdrawal
                                if(input3.equals("1")) {
                                    checkingOrSavingsMenu();
                                    checkingOrSavings = input.nextLine();
                                    do {
                                        if(checkingOrSavings.equals("1") || checkingOrSavings.equals("2")) {
                                            do {
                                                withdrawMenu();
                                                withdrawInput = input.nextLine();
                                                double before = 0;
                                                if(withdrawInput.equals("1")) {
                                                    if(checkingOrSavings.equals("1")) {
                                                        before = checking[active_account];
                                                        checking[active_account] = withdraw(20, checking[active_account]);
                                                        if(checking[active_account] != before) {
                                                            System.out.println("Transaction completed. You have withdrawn $20.00 from your checking account");
                                                        }
                                                        checkingOrSavings = "3";
                                                        withdrawInput = "7";
                                                    } else {
                                                        before = saving[active_account];
                                                        saving[active_account] = withdraw(20, saving[active_account]);
                                                        if(saving[active_account] != before) {
                                                            System.out.println("Transaction completed. You have withdrawn $20.00 from your savings account");
                                                        }
                                                        checkingOrSavings = "3";
                                                        withdrawInput = "7";
                                                    }
                                                } else if(withdrawInput.equals("2")) {
                                                    if(checkingOrSavings.equals("1")) {
                                                        before = checking[active_account];
                                                        checking[active_account] = withdraw(40, checking[active_account]);
                                                        if(checking[active_account] != before) {
                                                            System.out.println("Transaction completed. You have withdrawn $40.00 from your checking account");
                                                        }
                                                        checkingOrSavings = "3";
                                                        withdrawInput = "7";
                                                    } else {
                                                        before = saving[active_account];
                                                        saving[active_account] = withdraw(40, saving[active_account]);
                                                        if(saving[active_account] != before) {
                                                            System.out.println("Transaction completed. You have withdrawn $40.00 from your savings account");
                                                        }
                                                        checkingOrSavings = "3";
                                                        withdrawInput = "7";
                                                    }
                                                } else if(withdrawInput.equals("3")) {
                                                    if(checkingOrSavings.equals("1")) {
                                                        before = checking[active_account];
                                                        checking[active_account] = withdraw(60, checking[active_account]);
                                                        if(checking[active_account] != before) {
                                                            System.out.println("Transaction completed. You have withdrawn $60.00 from your checking account");
                                                        }
                                                        checkingOrSavings = "3";
                                                        withdrawInput = "7";
                                                    } else {
                                                        before = saving[active_account];
                                                        saving[active_account] = withdraw(60, saving[active_account]);
                                                        if(saving[active_account] != before) {
                                                            System.out.println("Transaction completed. You have withdrawn $60.00 from your savings account");
                                                        }
                                                        checkingOrSavings = "3";
                                                        withdrawInput = "7";
                                                    }
                                                } else if(withdrawInput.equals("4")) {
                                                    if(checkingOrSavings.equals("1")) {
                                                        before = checking[active_account];
                                                        checking[active_account] = withdraw(80, checking[active_account]);
                                                        if(checking[active_account] != before) {
                                                            System.out.println("Transaction completed. You have withdrawn $80.00 from your checking account");
                                                        }
                                                        checkingOrSavings = "3";
                                                        withdrawInput = "7";
                                                    } else {
                                                        before = saving[active_account];
                                                        saving[active_account] = withdraw(80, saving[active_account]);
                                                        if(saving[active_account] != before) {
                                                            System.out.println("Transaction completed. You have withdrawn $80.00 from your savings account");
                                                        }
                                                        checkingOrSavings = "3";
                                                        withdrawInput = "7";
                                                    }
                                                } else if(withdrawInput.equals("5")) {
                                                    if(checkingOrSavings.equals("1")) {
                                                        before = checking[active_account];
                                                        checking[active_account] = withdraw(100, checking[active_account]);
                                                        if(checking[active_account] != before) {
                                                            System.out.println("Transaction completed. You have withdrawn $100.00 from your checking account");
                                                        }
                                                        checkingOrSavings = "3";
                                                        withdrawInput = "7";
                                                    } else {
                                                        before = saving[active_account];
                                                        saving[active_account] = withdraw(100, saving[active_account]);
                                                        if(saving[active_account] != before) {
                                                            System.out.println("Transaction completed. You have withdrawn $100.00 from your savings account");
                                                        }
                                                        checkingOrSavings = "3";
                                                        withdrawInput = "7";
                                                    }
                                                } else if(withdrawInput.equals("6")) {
                                                    System.out.print("Please enter the amount(in increments of $20.00) you would like to withdraw:");
                                                    otherWithdraw = input.nextLine();
                                                    double money = Double.parseDouble(otherWithdraw);
                                                    if(money % 20 == 0) {
                                                        if(checkingOrSavings.equals("1")) {
                                                            before = checking[active_account];
                                                            checking[active_account] = withdraw(money, checking[active_account]);
                                                            if(checking[active_account] != before) {
                                                                System.out.println("Transaction completed. You have withdrawn $" + money + "0 from your checking account");
                                                            }
                                                            checkingOrSavings = "3";
                                                            withdrawInput = "7";
                                                        } else {
                                                            before = saving[active_account];
                                                            saving[active_account] = withdraw(money, saving[active_account]);
                                                            if(saving[active_account] != before) {
                                                                System.out.println("Transaction completed. You have withdrawn $" + money + "0 from your savings account");
                                                            }
                                                            checkingOrSavings = "3";
                                                            withdrawInput = "7";
                                                        }
                                                    } else {
                                                        System.out.println("Invalid withdrawal amount. Please enter a different amount");
                                                    }
                                                } else if(withdrawInput.equals("7")) {
                                                    // set to 3 to stop previous loop
                                                    System.out.println("Transaction Incomplete.");
                                                    checkingOrSavings = "3";
                                                }
                                            } while(!withdrawInput.equals("7"));
                                        } else if(checkingOrSavings.equals("3")) {
                                            System.out.println("Transaction Incomplete.");
                                        }
                                    } while (!checkingOrSavings.equals("3"));
                                } else if(input3.equals("2")) {
                                    // Cash deposit

                                } else if(input3.equals("3")) {
                                    // Transfer

                                } else if(input3.equals("4")) {
                                    // Balance Inquiry

                                } else {

                                }

                            } while(!input3.equals("5"));
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
        System.out.print("*** Welcome to ELACATM ***\n" +
                "1. Input PIN\n" +
                "2. Clear\n" +
                "3. Exit\n" +
                "Please make a selection: ");
    }

    private static void menu2() {
        System.out.println("\nPlease input your pin:");
    }

    private static void menu3() {
        System.out.print("\n*** ELACATM system ***\n" +
                "1. Withdrawal\n" +
                "2. Cash Deposit\n" +
                "3. Tranfer\n" +
                "4. Balance Inquiry\n" +
                "5. Logout\n" +
                "Please make a selection: ");
    }

    private static int checkPIN(String custPinInput, int numberOfAccounts, String[] pin, int active_account) {
        for(int i = 0; i < numberOfAccounts; i++) {
            if(pin[i].equals(custPinInput)) {
                return active_account = i;
            }
        }
        return -1;
    }
    private static void checkingOrSavingsMenu() {
        System.out.print("\n1. Checking\n" +
            "2. Savings\n" +
            "3. Cancel transaction\n" +
            "Plese select account you would like to withdraw from:");
    }

    private static void withdrawMenu() {
        System.out.print("\n1. $20.00\n" +
            "2. $40.00\n" +
            "3. $60.00\n" +
            "4. $80.00\n" +
            "5. $100.00\n" +
            "6. Other\n" +
            "7. Cancel Transaction\n" +
            "Please select amount to withdraw:\n");
    }

    private static double withdraw(double amount, double total) {
        if((total - amount)< 0) {
            System.out.println("Insufficient funds. Please enter a different amount.");
        } else {
            total -= amount;
        }
        System.out.println(total);
        return total;
    }

    private static void deposit() {

    }

    private static void transfer() {

    }

    private static void balanceInquiry() {

    }
}