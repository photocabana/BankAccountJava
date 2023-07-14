public class BankTest {
    public static void main(String[] args) {

        // Create 3 bank accounts
        BankAccount fiskBankAccount = new BankAccount();
        BankAccount mikeBankAccount = new BankAccount();
        BankAccount rindyBankAccount = new BankAccount();


        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        // - each deposit should increase the amount of totalMoney
        fiskBankAccount.depositMoney(1500, "checking");
        fiskBankAccount.depositMoney(2000, "savings");
        mikeBankAccount.depositMoney(500, "checking");
        mikeBankAccount.depositMoney(750, "savings");
        rindyBankAccount.depositMoney(6500, "checking");
        rindyBankAccount.depositMoney(1262, "savings");


        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney
        fiskBankAccount.withdrawMoney(200, "checking");
        fiskBankAccount.withdrawMoney(586, "savings");
        mikeBankAccount.withdrawMoney(900, "checking");
        mikeBankAccount.withdrawMoney(5000, "savings");
        rindyBankAccount.withdrawMoney(100, "checking");
        rindyBankAccount.withdrawMoney(275, "savings");


        // Static Test (print the number of bank accounts and the totalMoney)
        fiskBankAccount.getCheckingBalance();
        fiskBankAccount.getSavingsBalance();
        mikeBankAccount.getCheckingBalance();
        mikeBankAccount.getSavingsBalance();
        rindyBankAccount.getCheckingBalance();
        rindyBankAccount.getSavingsBalance();

        System.out.println(fiskBankAccount.getCheckingBalance());
        System.out.println(fiskBankAccount.getSavingsBalance());
        System.out.println(mikeBankAccount.getCheckingBalance());
        System.out.println(mikeBankAccount.getSavingsBalance());
        System.out.println(rindyBankAccount.getCheckingBalance());
        System.out.println(rindyBankAccount.getSavingsBalance());

        System.out.println(BankAccount.totalMoney);
    }
}

