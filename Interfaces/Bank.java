// Develop an interface with two methods namely, withdraw money and deposit money. Develop a class
// Account that implements the interface with necessary private data members such as current account
// balance and account number. Develop another class CreditCardAccount that implements the interface
// with necessary data members such as current credit limit and the credit card number. When money is
// withdrawn from a credit card account; the credit limit is diminished by the amount of money withdrawn
// and by an additional 0.5% of the amount of money withdrawn and when the money is deposited; the
// credit limit is increased by the amount of money deposited. Develop a class containing the main method
// and create an account object and a credit card account object and demonstrate the withdrawal and
// deposit method on the objects.

interface Transactions{
    void withdraw(double amount);
    void deposit(double amount); 
}

class Account implements Transactions{
    private double accountBalance;
    private String accountNumber;
    
    public Account(double accountBalance, String accountNumber) {
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public void withdraw(double amount) {
        if(this.accountBalance>=amount){
            this.accountBalance-=amount;
            System.out.println("Withdrawn "+amount+" from credit card "+accountNumber);
        }
        else{
            System.out.println("Insufficient funds in account "+accountNumber);
        }
    }

    @Override
    public void deposit(double amount) {
        this.accountBalance+=amount;
        System.out.println("Deposited "+amount+" to account "+accountNumber);
    }

}

class CreditCardAccount implements Transactions{
    private double creditLimit;
    private String creditCardNumber;

    public CreditCardAccount(double creditLimit, String creditCardNumber) {
        this.creditLimit = creditLimit;
        this.creditCardNumber = creditCardNumber;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public void withdraw(double amount) {
        if(this.creditLimit>=amount){
            this.creditLimit-=amount+(0.005*amount);
            System.out.println("Withdrawn "+amount+" from Credit card "+creditCardNumber);
        }
        else{
            System.out.println("Exceeded credit limit of credit card "+creditCardNumber);
        }
    }

    @Override
    public void deposit(double amount) {
        this.creditLimit+=amount;
        System.out.println("Deposoited "+amount+" to Credit Card "+creditCardNumber);
    }
    
}

public class Bank {
    public static void main(String[] args) {
        Account account =new Account(1000,"123456");
        CreditCardAccount c=new CreditCardAccount(1000, "987654");
        
        account.withdraw(100.0);
        account.deposit(100.0);
        System.out.println("Account Balance: "+account.getAccountBalance());
        
        c.withdraw(100.0);
        c.deposit(100.0);
        System.out.println("Credit Limit: "+c.getCreditLimit());   
    }

}
