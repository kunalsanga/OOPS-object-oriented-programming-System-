// Define the Account interface
interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    void viewBalance();
}

// Implement the SavingAccount class
class SavingAccount implements Account {
    private double balance;
    private final double interestRate = 0.03;  // Example interest rate of 3%

    // Constructor
    public SavingAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Deposit method
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " in Saving Account.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " from Saving Account.");
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    // View Balance method
    @Override
    public void viewBalance() {
        System.out.println("Saving Account Balance: " + balance);
    }

    // Method to apply interest
    public void applyInterest() {
        balance += balance * interestRate;
        System.out.println("Interest applied to Saving Account. New Balance: " + balance);
    }
}

// Implement the CurrentAccount class
class CurrentAccount implements Account {
    private double balance;
    private final double overdraftLimit = 500;  // Example overdraft limit of 500

    // Constructor
    public CurrentAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Deposit method
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " in Current Account.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " from Current Account.");
        } else {
            System.out.println("Exceeds overdraft limit or invalid amount.");
        }
    }

    // View Balance method
    @Override
    public void viewBalance() {
        System.out.println("Current Account Balance: " + balance);
    }
}

// Main class to test the implementation
public class BankSystem {
    public static void main(String[] args) {
        // Create accounts
        Account savingAccount = new SavingAccount(1000);  // initial balance 1000
        Account currentAccount = new CurrentAccount(500); // initial balance 500

        // Perform transactions
        savingAccount.deposit(200);
        savingAccount.withdraw(50);
        savingAccount.viewBalance();

        currentAccount.deposit(300);
        currentAccount.withdraw(600);
        currentAccount.viewBalance();

        // Apply interest to SavingAccount
        if (savingAccount instanceof SavingAccount) {
            ((SavingAccount) savingAccount).applyInterest();
            savingAccount.viewBalance();
        }
    }
}
