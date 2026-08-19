import java.util.Scanner;

public class method {

    static class BankAccount {
        String accountName;
        int balance;

        void deposit(int amount) {
            balance += amount;
        }

        void withdraw(int amount) {
            balance -= amount;
        }

        int getBalance() {
            return balance;
        }
        
        BankAccount (String accountName, int balance) {
            this.accountName = accountName;
            this.balance = balance;

        }

    static class SavingsAccount extends BankAccount {
        

        void withdraw(int amount) {

            if (amount <= 10000) {
                balance-=amount;
            } else {
                System.out.println("Withdrawal is not allowed");
            }
        }



        public SavingsAccount(String accountName, int balance) {
            super(accountName, balance);
        }


        

    }

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("john", 1000);
        BankAccount account2 = new BankAccount("Brit", 2000);

        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());

    }
    }
    
}
