public class BankAccount {
    private String name;
    private long balance;

    public BankAccount(String name) {
        this.name = name;
        this.balance = 0;
    }

    public boolean withdraw(long amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public void deposit(long amount) {
        this.balance += amount;
    }

    public String getName() {
        return this.name;
    }

    public boolean transfer(long amount, BankAccount destination) {
        if (this.balance >= amount) {
            this.balance -= amount;
            destination.deposit(amount);
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "Account " + name + " has balance $" + Long.toString(balance);
    }
}
