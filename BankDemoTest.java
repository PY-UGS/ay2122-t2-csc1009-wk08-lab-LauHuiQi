import java.util.InputMismatchException;
import java.util.Scanner;

public class BankDemoTest {

    public static void main(String[] args) throws Exception {
        CheckingAccount ca = new CheckingAccount();
        int choice = -1;
        Scanner scan = new Scanner(System.in);

        while (true && choice != 0) {
            System.out.println("\n1.Deposit\n2.Withdraw\n3.Check Balance\n0. Exit Program");
            System.out.println("Enter your choice:");
            choice = scan.nextInt();
            try {
                switch (choice) {
                    case 1:
                        System.out.println("Enter amount to deposit:");
                        Scanner amountDeposit = new Scanner(System.in);
                        ca.deposit(amountDeposit.nextDouble());
                        break;
                    case 2:
                        System.out.println("Enter amount to withdraw:");
                        Scanner amountWithdraw = new Scanner(System.in);
                        ca.withdraw(amountWithdraw.nextDouble());
                        break;
                    case 3:
                        System.out.println("Your current blanace is: " + ca.getBalance());
                        break;
                    case 0:
                        System.out.println("Exiting..");
                        break;
                    default:
                        System.out.println("Please eneter a valid choice number.");
                        break;
                }
            } catch (InsufficientFundsException e) {
                System.out.println("Sorry, but your account is short by: " + e.getAmount());
            } catch (InputMismatchException e) {
                System.out.println("Invalid input: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Exception message: " + e.getMessage());

            }
        }
    }

}