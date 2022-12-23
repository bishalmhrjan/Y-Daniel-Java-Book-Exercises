package chapter11codes.elfpunktedrei;

import java.util.Date;

public class Account {
    private int accountNumber;
    private double balance;
    private  double interestRate;
    private Date created;

    public Account(int accountNumber, double balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;
        this.created = new Date();
    }

    public double deposit(double amount){
        if(amount >0){
            this.setBalance(this.getBalance() + amount);
            return amount;
        }
        return 0;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public double withdraw(double amount){
        if(amount > 0 && amount <= this.getBalance()){
            return amount;
        }
        return  0;
    }
}
