package chapter11codes.elfpunkteacht;

public class Transaction {
    private char charr;
    private double amount;
    private double balance;
    private  String description;

    public Transaction(char charr, double amount, double balance, String description) {
        this.charr = charr;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "charr=" + charr +
                ", amount=" + amount +
                ", balance=" + balance +
                ", description='" + description + '\'' +
                '}';
    }
}
