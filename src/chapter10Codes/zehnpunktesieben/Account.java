package chapter10Codes.zehnpunktesieben;

public class Account {
    private double balance = 100;
    private  int i ;




    public double getBalance(){
        return  this.balance;
    }

    public void setBalance(double rest){
        this.balance = rest;
    }

    public double withdrawMoney(double amount){
        if(this.getBalance() > amount && amount > 0){
            this.setBalance(this.getBalance()-amount);
            return  this.getBalance();
        }
        return 0;
    }

    public double deposit(double amount){
        if(amount < 0){

            return 0;
        }
        this.setBalance(this.getBalance()+amount);
        return this.getBalance();
    }


}
