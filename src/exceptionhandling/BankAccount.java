package exceptionhandling;

public class BankAccount {

    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

   
    public void deposit(double amount) throws IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
        System.out.println("Deposited " + amount);
        System.out.println("New Balance" + balance);
    }

    
    public void withdraw(double amount) throws IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds.");
        }
        balance -= amount;
        System.out.println("Withdrawn " + amount);
        System.out.println("Remaining Balance" + balance);
    }

    
    public void checkBalance() {
        System.out.println("Current Balance " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(500); 

        try {
            account.deposit(200);     
            account.withdraw(800);   
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        account.checkBalance(); 
    }
}
