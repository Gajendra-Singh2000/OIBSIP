import java.util.Scanner;

public class ATM {
    private static Scanner scanner = new Scanner(System.in);
    private static double balance = 1000; // Initial balance for demonstration purposes

    public static void main(String[] args) {
        login();
    }

    private static void login() {
        System.out.println("Welcome to the ATM");
        System.out.print("Enter user id: ");
        String userId = scanner.next();
        System.out.print("Enter user pin: ");
        String pin = scanner.next();

        // Dummy validation, replace this with your actual validation logic
        if (userId.equals("123") && pin.equals("456")) {
            showMenu();
        } else {
            System.out.println("Invalid credentials. Exiting...");
        }
    }

    private static void showMenu() {
        int choice;
        do {
            System.out.println("\nATM Menu:");
            System.out.println("1. Transactions History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Quit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayTransactionsHistory();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    transfer();
                    break;
                case 5:
                    System.out.println("Exiting ATM. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

    private static void displayTransactionsHistory() {
        System.out.println("Transaction History: (Dummy Data)");
        // You can implement actual transaction history logic here
    }

    private static void withdraw() {
        System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: $" + balance);
        } else {
            System.out.println("Invalid amount or insufficient funds. Please try again.");
        }
    }

    private static void deposit() {
        System.out.print("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: $" + balance);
        } else {
            System.out.println("Invalid amount. Please try again.");
        }
    }

    private static void transfer() {
        System.out.print("Enter the amount to transfer: ");
        double amount = scanner.nextDouble();

        if (amount > 0 && amount <= balance) {
            System.out.print("Enter the recipient's account number: ");
            String recipientAccount = scanner.next();
            // Implement transfer logic here
            System.out.println("Transfer successful. Remaining balance: $" + balance);
        } else {
            System.out.println("Invalid amount or insufficient funds. Please try again.");
        }
    }
}