class BankAccount {

    String name = "Aditya";
    int balance = 10000;

    void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(int amount) {

        if(amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void display() {
        System.out.println("Current Balance = " + balance);
    }
}

public class BankingDemo {
    public static void main(String[] args) {

        BankAccount b = new BankAccount();

        b.display();

        b.deposit(5000);

        b.withdraw(3000);

        b.display();
    }
}



