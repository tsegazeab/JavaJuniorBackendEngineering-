public class BankingSystem {
    public static void main(String[] args) {
        // Declare variables
        String customerName;
        int accountNumber;
        double balance;

        // Initialize variables
        customerName = "Assefa Moges";
        accountNumber = 123456789;
        balance = 1000.00;

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

        // Prompt the user for a deposit amount
        System.out.println("Enter a deposit amount: ");
        double depositAmount = Double.parseDouble(System.console().readLine());

        // Deposit the amount into the account
        balance += depositAmount;

        // Display the customer's new balance
        System.out.println("New balance: " + balance);

        // Display a menu of options
        System.out.println("1. Withdraw money");
        System.out.println("2. Deposit money");
        System.out.println("3. Check balance");
        System.out.println("4. Exit");

        // Prompt the user to select an option
        System.out.println("Enter an option: ");
        int option = Integer.parseInt(System.console().readLine());

        // Use a switch statement to handle the user's selection
        switch (option) {
            case 1:
                // Withdraw money
                withdrawalAmount = Double.parseDouble(System.console().readLine());

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
                depositAmount = Double.parseDouble(System.console().readLine());

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
                // Exit
                System.out.println("Goodbye!");

                System.exit(0);

                break;
            default:
                System.out.println("Invalid option.");
        }
    }
}