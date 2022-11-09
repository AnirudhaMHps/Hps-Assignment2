package bank.exception;

import java.util.Scanner;

public class BankAccount {
        int accNO;
        String custName;
        String accType;
        float balance;
        public float getBalance () {
            if (accType.equals("savings")) {
                if (balance < 1000) {
                    try {
                        throw new LowBalanceException();
                    } catch (LowBalanceException lb) {
                        System.out.println("Balance is low" + balance);
                    }
                }
            }
            if (accType.equals("current")) {
                if (balance < 5000) {
                    try {
                        throw new LowBalanceException();
                    } catch (LowBalanceException lb) {
                        System.out.println("Balance is low" + balance);
                    }
                }
            }
            return balance;
        }
        public BankAccount( int accNO, String custName, String accType,
        float balance){

        this.accNO = accNO;
        this.custName = custName;
        this.accType = accType;
        this.balance = balance;
    }
    public BankAccount() {

        this.accNO = 101;
        this.custName = "Manas";
        this.accType = "savings";
        this.balance = 1000;
    }
        void deposit ( float amt)

        {
            if (amt < 0) {
                try {
                    throw new NegativeAmountException();
                } catch (NegativeAmountException nae) {
                    System.out.println("Negaive Amount cant be deposited");
                }
            }
            else {
                balance = getBalance() + amt;
                System.out.println("Current balance is =" + balance);
            }
        }
        public void withdraw ( float amt){
            if (accType.equals("savings")) {
                if (amt > 1000) {
                    try {
                        throw new InsufficientFundsException();
                    } catch (InsufficientFundsException ife) {
                        System.out.println("WE CANT Withdraw AMOUNT INSUFFICENT BALANCE ");
                    }
                }
                 else if (amt < 0) {
                        try {
                            throw new NegativeAmountException();
                        } catch (NegativeAmountException nae) {
                            System.out.println("Negaive Amount cant be withdrawn");
                        }
                    }
                else {
                balance = getBalance() - amt;
                        System.out.println("Current balance is =" + balance);
                    }
                }
            if (accType.equals("current")) {
                if (amt > 5000) {
                    try {
                        throw new InsufficientFundsException();
                    } catch (InsufficientFundsException ife) {
                        System.out.println("WE CANT Withdraw AMOUNT INSUFFICENT BALANCE ");
                    }
                }
                else if (amt < 0) {
                    try {
                        throw new NegativeAmountException();
                    } catch (NegativeAmountException nae) {
                        System.out.println("Negaive Amount cant be withdrawn");
                    }
                }
                else {
                    balance = getBalance() - amt;
                    System.out.println("Current balance is =" + balance);
                }
            }
    }
        void display()
        {
            System.out.println("Balance is ="+getBalance());
        }

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            BankAccount b = new BankAccount();
            b.deposit(2000);
            b.display();
            b.withdraw(5000);
            b.display();
            b.withdraw(1000);
            b.getBalance();
            b.display();
        }
    }

