abstract class Bank {
    abstract double getInterestRate();

    void display() {
        System.out.println("Welcome to the Bank");
    }
}

class SBI extends Bank {
    double getInterestRate() {
        return 6.5;
    }
}

class HDFC extends Bank {
    double getInterestRate() {
        return 7.0;
    }
}

public class BankDemo {
    public static void main(String[] args) {
        SBI s = new SBI();
        HDFC h = new HDFC();

        s.display();
        System.out.println("SBI Interest Rate: " + s.getInterestRate() + "%");

        h.display();
        System.out.println("HDFC Interest Rate: " + h.getInterestRate() + "%");
    }
}