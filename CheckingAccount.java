import java.util.InputMismatchException;

public class CheckingAccount {

    double amount;

    public void deposit(double amount) throws Exception {

        if (amount <= 0) {
            throw new InputMismatchException("Value entered is zero negative");
        }
        this.amount += amount;
        System.out.println("The balance after deposit is: $" + this.amount);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        double balance = 0;
        if (amount > 0) {
            balance = this.amount - amount;
        } else {
            throw new InputMismatchException("Value entered is zero or negative");
        }
        if (balance < 0) {
            throw new InsufficientFundsException(amount - this.amount);
        } else {
            this.amount -= amount;
            System.out.println("The balance after withdraw is: $" + this.amount);
        }

    }

    public double getBalance() {
        return this.amount;
    }
}