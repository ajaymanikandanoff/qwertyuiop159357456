// Ex : 2c - Demonstrate Access Specifiers and Encapsulation

class BankAccount {
    // Public data member: Accessible directly outside the class
    public String accountHolder;

    // Private data member: Accessible ONLY within this class (Encapsulation)
    private double balance = 0.0;

    // Public method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Public method to display account details and balance
    public void displayBalance() {
        System.out.println("----- Bank Account Details -----");
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Current Balance: " + balance);
    }
}

public class Ex2c {
    public static void main(String[] args) {
        // Create an object of BankAccount class
        BankAccount acc = new BankAccount();

        // Accessing public member directly
        acc.accountHolder = "Ajay";

        // Note: The statement below causes a compile-time error if uncommented:
        // acc.balance = 5000; // Error: balance has private access in BankAccount

        // Performing deposit operation via public method
        acc.deposit(5000.0);

        // Display updated balance
        acc.displayBalance();
    }
}
