import java.util.Scanner;

class Account {
    private double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void addFunds(double amount) {
        this.balance += amount;
    }

    public boolean withdrawFunds(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            return true;
        }
        return false;
    }
}

class ATMSystem {
    private Account account;

    public ATMSystem(Account account) {
        this.account = account;
    }

    private void showMenu() {
        System.out.println("ATM Menu:");
        System.out.println("1. View Balance");
        System.out.println("2. Deposit Funds");
        System.out.println("3. Withdraw Funds");
        System.out.println("4. Exit");
    }

    public void operate() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            showMenu();
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Current balance: Rs. " + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = scanner.nextDouble();
                    account.addFunds(deposit);
                    System.out.println("Deposit successful. New balance: Rs. " + account.getBalance());
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawal = scanner.nextDouble();
                    if (account.withdrawFunds(withdrawal)) {
                        System.out.println("Withdrawal successful. Remaining balance: Rs. " + account.getBalance());
                    } else {
                        System.out.println("Insufficient funds.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Account userAccount = new Account(1000); // Starting balance
        ATMSystem atm = new ATMSystem(userAccount);
        atm.operate();
    }
}
