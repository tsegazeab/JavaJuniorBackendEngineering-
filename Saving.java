import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Saving extends Account {
    private double interestRate;
    private static final String ACCOUNTS_FILE = "accounts.csv";
    // Declare variables
    // String customerName;
    // int accountNumber;
    // double balance;

    // Initialize variables
    private static List<Account> readAccountsFromCSV() {
        List<Account> accounts = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(ACCOUNTS_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                int accountNumber = Integer.parseInt(data[0]);
                String accountHolder = data[1];
                double balance = Double.parseDouble(data[2]);
                System.out.println("accountNumber: " + accountNumber);
                Account account = new Account(accountNumber, accountHolder, balance);
                accounts.add(account);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return accounts;
    }

    String customerName = "Assefa Moges";
    int accountNumber = 123456789;
    double balance = 1000.00;

    public Saving() {

    }

    /**
     * @param amount
     */
    public void withdraw(double amount) {

        // Display a menu of options
        System.out.println("1. Withdraw money");
        System.out.println("2. Deposit money");
        System.out.println("3. Check balance");
        System.out.println("4. Display KYC");
        System.out.println("5. Exit");

        // Prompt the user to select an option
        System.out.println("Enter an option: ");
        int option = Integer.parseInt(System.console().readLine());

        // Use a switch statement to handle the user's selection
        switch (option) {
            case 1:
                // Prompt the user for a withdrawal amount
                System.out.println("Enter a withdrawal amount: ");
                double withdrawalAmount = Double.parseDouble(System.console().readLine());

                // Check if the withdrawal amount is greater than the account balance
                if (withdrawalAmount > balance) {
                    System.out.println("Insufficient funds.");
                } else {
                    // Withdraw the amount from the account
                    balance -= withdrawalAmount;

                    // Display the customer's new balance
                    System.out.println("New balance: " + balance);
                }

                break;
            case 2:
                // Deposit money
                System.out.println("Enter a deposit amount: ");
                double depositAmount = Double.parseDouble(System.console().readLine());

                // Deposit the amount into the account
                balance += depositAmount;

                // Display the customer's new balance
                System.out.println("New balance: " + balance);

                break;
            case 3:
                // Check balance
                System.out.println("Your balance is: " + balance);

                break;
            case 4:
                // Display KYC
                System.out.println("Customer Name:" + customerName);
                System.out.println("Account Number:" + accountNumber);

                break;

            case 5:
                // Exit
                System.out.println("Goodbye!");

                System.exit(0);

                break;
            // Exit

            default:
                System.out.println("Invalid option.");
        }
    }
    // Polymorphism - overriding the checkBalance method
    /*
     * @Override
     * public void checkBalance() {
     * System.out.println("Current balance (Deposit Account): $" + getBalance());
     * }
     */

    public static void main(String[] args) {
        Saving saving = new Saving();
        saving.readAccountsFromCSV();
        saving.withdraw(50.00);

    }
}