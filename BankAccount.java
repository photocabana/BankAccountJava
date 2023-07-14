public class BankAccount {

    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;

    public static int accounts = 0;
    public static double totalMoney = 0; // refers to the sum of all bank account checking and savings balances



    // CONSTRUCTOR
    // Be sure to increment the number of accounts
    public BankAccount() {
        BankAccount.accounts += 1;
        this.checkingBalance = 0;
        this.savingsBalance = 0;
    }



    // METHODS
    // deposit - users should be able to deposit money into their checking or savings account
    public void depositMoney(double amount, String account) {
        if (account == "checking") {
            this.checkingBalance += amount;
        }
        else {
            this.savingsBalance += amount;
        }
        this.totalMoney += amount;
    }


    // withdraw 
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
    public void withdrawMoney(double amount, String account) {
        if (account == "checking") {
            if (amount > this.checkingBalance) {
                System.out.println("Insufficient Funds - You do not have enough for this transaction");
                return;
            }
            this.checkingBalance -= amount;
        }
        else {
            if (amount > this.savingsBalance) {
                System.out.println("Insufficient Funds - You do not have enough for this transaction");
                return;
            }
            this.savingsBalance -= amount;
        }
        this.totalMoney -= amount;
    }



    // getBalance - display total balance for checking and savings of a particular bank account
    // GETTERS
    public double getCheckingBalance() {
        return this.checkingBalance;
    }
    
    public double getSavingsBalance() {
        return this.savingsBalance;
    }
}

