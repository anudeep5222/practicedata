package classMethods;

public class BankAccount {
    int accountNumber;
    String accountHolder;
    double balance;

    public BankAccount(int accountnum, String name, double balance) {
        this.accountNumber = accountnum;
        this.accountHolder = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("You have deposited amount " + amount);
    }

    public void withdraw(double withdrawamount) {
        if (withdrawamount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= withdrawamount; 
            System.out.println("You have withdrawn amount " + withdrawamount);
        }
    }

    public void getBalance() {
        System.out.println("Your balance is " + balance);
    }

    public static void main(String[] args) {
        BankAccount p1 = new BankAccount(12312A, "Sandy", 1000);
        p1.deposit(1000);
        p1.getBalance();
        p1.withdraw(9887);
        p1.getBalance();  
    }
}
