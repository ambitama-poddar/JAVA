// . Create a class called Account to represent a bank account held by a customer (account holder). An
// account is characterized by the private fields – an account number (type String), the account balance
// (type double) and the name of the account holder (type String). The Account class should have a
// constructor that initializes the instance fields. Provide a set and a get method for each instance field. In
// addition, provide the deposit and withdrawal method and a method named computeInterest that
// calculates the interest earned by an account if the interest rate is 6% per annum. Test the class using the
// main method showing the invocation of deposit, withdrawal and computeInterest methods. 

import java.util.Scanner;

public class Account{
    private String accountNumber;
    private double accountBalance;
    private String accountHolder;
    
    public Account(String accountNumber, double accountBalance, String accounttHolder) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.accountHolder = accounttHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accounttHolder) {
        this.accountHolder = accounttHolder;
    }

    @Override
    public String toString() {
        return "Account [accountNumber=" + accountNumber + ", accountBalance=" + accountBalance + ", accounttHolder="
                + accountHolder + "]";
    }

    public void deposit(double amount){
        this.accountBalance+=amount;
    }

    public void withdrawal(double amount){
        this.accountBalance-=amount;
    }

    public double computeInterest(){
        return this.accountBalance*0.06;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter account no.:");
        String accountNumber=sc.next();
        
        System.out.println("Enter account balance:");
        double accountBalanace=sc.nextDouble();

        System.out.println("Enter account holder name:");
        String accountHolder=sc.next();

        Account account=new Account(accountNumber, accountBalanace, accountHolder);
        account.toString();

        System.out.println("Enter amount to deposit:");
        double amount=sc.nextDouble();
        account.deposit(amount);

        System.out.println("Account balance after deposit: "+account.getAccountBalance());

        System.out.println("Enter amount to withdraw:");
        amount=sc.nextDouble();
        account.withdrawal(amount);

        System.out.println("Account balance after withdrawal: "+account.getAccountBalance());

        System.out.println("Interest earned: "+account.computeInterest());
        sc.close();
    }
    
}