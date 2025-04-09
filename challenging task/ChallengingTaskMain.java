class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Cannot deposit a negative amount.");
        }
    }

    public void displayBalance() {
        System.out.println("Current balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(double initialBalance, double interestRate) {
        super(initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            double interest = amount * (interestRate / 100);
            balance += amount + interest;
            System.out.println("Deposited: $" + amount + " with interest: $" + interest);
        } else {
            System.out.println("Cannot deposit a negative amount.");
        }
    }
}

class CheckingAccount extends BankAccount {

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount + " into checking account.");
        } else {
            System.out.println("Cannot deposit a negative amount.");
        }
    }
}

public class ChallengingTaskMain {
    public static void main(String[] args) {
        // Create a savings account with an initial balance and interest rate
        SavingsAccount savingsAccount = new SavingsAccount(1000.0, 5.0);
        savingsAccount.deposit(500.0);
        savingsAccount.displayBalance();

        CheckingAccount checkingAccount = new CheckingAccount(1000.0);
        checkingAccount.deposit(500.0);
        checkingAccount.displayBalance();
    }
}
