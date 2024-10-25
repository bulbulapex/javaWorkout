// Abstract class
abstract class BankAccount {
    protected double balance;

    // Constructor
    public BankAccount() {
        this.balance = 0.0;
    }

    // Abstract methods
    abstract void deposit(double amount);
    abstract void withdraw(double amount);

    // Method to display the balance
    public void displayBalance() {
        System.out.println("Current balance: $" + balance);
    }
}

// Subclass for savings account
class SavingsAccount extends BankAccount {
    
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " to Savings Account.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from Savings Account.");
        } else {
            System.out.println("Withdrawal amount must be positive and less than or equal to the balance.");
        }
    }
}

// Subclass for current account
class CurrentAccount extends BankAccount {
    
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " to Current Account.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from Current Account.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
}

// Main class to demonstrate the functionality
/*public class Main {
    public static void main(String[] args) {
        // Create a SavingsAccount
        BankAccount savings = new SavingsAccount();
        savings.deposit(500);
        savings.withdraw(200);
        savings.displayBalance();

        // Create a CurrentAccount
        BankAccount current = new CurrentAccount();
        current.deposit(1000);
        current.withdraw(1500);
        current.displayBalance();
    }
}*/
