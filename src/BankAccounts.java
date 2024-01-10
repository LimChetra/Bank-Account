import java.util.Scanner;
public class BankAccounts {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    // Parameter constructor
    public BankAccounts(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Method to deposit funds
    public void depositFunds(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of " + amount + " successfully made.");
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }

    // Method to withdraw funds
    public void withdrawFunds(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawal of " + amount + " successfully made.");
            } else {
                System.out.println("Insufficient balance. Unable to withdraw funds.");
            }
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the account number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter the initial balance: ");
        double initialBalance = scanner.nextDouble();

        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter the customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter the email: ");
        String email = scanner.nextLine();

        System.out.print("Enter the phone number: ");
        String phoneNumber = scanner.nextLine();

        BankAccounts account = new BankAccounts(accountNumber, initialBalance, customerName, email, phoneNumber);

        account.displayAccountDetails();

        System.out.print("Enter the amount to deposit: ");
        double amountToDeposit = scanner.nextDouble();
        account.depositFunds(amountToDeposit);

        System.out.print("Enter the amount to withdraw: ");
        double amountToWithdraw = scanner.nextDouble();
        account.withdrawFunds(amountToWithdraw);

        account.displayAccountDetails();

        scanner.close();
    }
}