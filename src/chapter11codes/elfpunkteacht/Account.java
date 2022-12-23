package chapter11codes.elfpunkteacht;

import java.util.ArrayList;

public class Account {
    private String name;
    private int id;
    private double balance;
    ArrayList<Transaction> transactions = new ArrayList<Transaction>();


    public Account(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    public Transaction withdraw(double amount){
        double balancee= -amount +this.getBalance();
        System.out.println(this.getBalance());
        Transaction transaction = new Transaction('W',amount,balancee,"transactionwithdrawal");
        System.out.println("-->"+this.getBalance());

        this.setBalance(this.getBalance()-amount);
        System.out.println("----->"+this.getBalance());

        transactions.add(transaction);
        return transaction;
    }

    public Transaction deposit(double amount){
        double balancee= this.getBalance()+amount;

        Transaction transaction = new Transaction('D',amount,balancee,"transactionwith deposit.");
        this.setBalance(this.getBalance()+amount);
        transactions.add(transaction);
        return transaction;

    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", balance=" + balance +
                ", transactions=" + transactions.toString() +
                '}';
    }
}
