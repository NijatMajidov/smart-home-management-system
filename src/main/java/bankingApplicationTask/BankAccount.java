package bankingApplicationTask;

import java.math.BigDecimal;

public class BankAccount {

    private String accountNumber;
    private BigDecimal balance;

    public BankAccount(String accountNumber, BigDecimal balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void withdraw(BigDecimal amount){
        if(balance.compareTo(amount)==-1){
            throw new InsufficientBalanceException("Kifayet qeder pul yoxdur");
        }
        balance = balance.subtract(amount);
    }
}