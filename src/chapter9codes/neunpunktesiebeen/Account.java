package chapter9codes.neunpunktesiebeen;

import java.util.Date;

public class Account {

    private double annualInterestRAte ;
    private Date dateCreated;
    private int id;
    private double balance;



    public Account() {

    }

    public Account(int id, int initialBalance) {
        this.id = id;
        this.balance = initialBalance;
    }

    public double getAnnualInterestRAte() {
        return annualInterestRAte;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate(){
        return annualInterestRAte / 12;
    }

    public double withdraw(double amount){
        if(this.getBalance() >= amount){
            this.balance = this.getBalance()-amount;
            return amount;
        }
        return  0;
    }

    public double deposit(double deposit){
        if(deposit >0){
            double balance = this.getBalance() + deposit;
            return balance;
        }
        return  0;
    }
}
