// Program to demonstrate the do-while loop using an ATM Menu System

import java.util.Scanner; // Imports the Scanner class for reading user input

public class ATMMenuSystem { // Declares the ATMMenuSystem class

    public static void main(String[] args) { // Main method where program execution starts

        // Creates a Scanner object to accept user input
        Scanner scanner = new Scanner(System.in);

        // Initializes the account balance
        double balance = 10000.00;

        // Stores the user's menu choice
        int choice;

        // Repeats the menu until the user selects the Exit option
        do {

            // Displays the ATM menu
            System.out.println("\n========== ATM MENU ==========");

            System.out.println("1. Check Balance");

            System.out.println("2. Deposit Amount");

            System.out.println("3. Withdraw Amount");

            System.out.println("4. Exit");

            // Prompts the user to select an option
            System.out.print("Enter Your Choice: ");

            // Reads the user's choice
            choice = scanner.nextInt();

            // Executes the selected option
            switch (choice) {

                // Executes when the user selects Check Balance
                case 1:

                    // Displays the available account balance
                    System.out.println("Available Balance : ₹" + balance);

                    break;

                // Executes when the user selects Deposit Amount
                case 2:

                    // Prompts the user to enter the deposit amount
                    System.out.print("Enter Deposit Amount: ₹");

                    // Reads the deposit amount
                    double depositAmount = scanner.nextDouble();

                    // Adds the deposit amount to the balance
                    balance = balance + depositAmount;

                    // Displays the updated balance
                    System.out.println("Updated Balance : ₹" + balance);

                    break;

                // Executes when the user selects Withdraw Amount
                case 3:

                    // Prompts the user to enter the withdrawal amount
                    System.out.print("Enter Withdrawal Amount: ₹");

                    // Reads the withdrawal amount
                    double withdrawalAmount = scanner.nextDouble();

                    // Checks whether sufficient balance is available
                    if (withdrawalAmount <= balance) {

                        // Deducts the withdrawal amount from the balance
                        balance = balance - withdrawalAmount;

                        // Displays the updated balance
                        System.out.println("Updated Balance : ₹" + balance);

                    } else {

                        // Displays an insufficient balance message
                        System.out.println("Insufficient Balance.");

                    }

                    break;

                // Executes when the user selects Exit
                case 4:

                    // Displays the exit message
                    System.out.println("Thank you for using the ATM.");

                    break;

                // Executes when an invalid option is selected
                default:

                    // Displays an invalid choice message
                    System.out.println("Invalid Choice! Please select a valid option.");

            } // Ends the switch statement

        } while (choice != 4); // Continues until the user selects Exit

        // Closes the Scanner object to release system resources
        scanner.close();

    } // Ends the main method

} // Ends the ATMMenuSystem class
