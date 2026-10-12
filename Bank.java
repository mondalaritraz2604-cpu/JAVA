
class Bank {
    String holderName;
    int accountNumber;
    double balance;

    Bank(String holderName, int accountNumber, double balance) {
        this.holderName = holderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void display() {
        System.out.println("Holder Name: " + holderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    void withdraw(double amount) {
        if (balance >= amount && amount > 0) {
            balance = balance - amount;
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance or Invalid Amount!");
        }
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit Successful");
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Invalid Deposit Amount!");
        }
    }

    public static void main(String[] args) {
        Bank b1 = new Bank("Aritra", 23469, 1);

        b1.deposit(150000000);
        b1.withdraw(1000);
        b1.display();
    }
}
