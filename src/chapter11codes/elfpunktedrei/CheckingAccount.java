package chapter11codes.elfpunktedrei;

public class CheckingAccount extends Account{
    private  double overDraftLimit;

    public CheckingAccount(int accountNumber, double balance, double interestRate, double overDraftLimit) {
        super(accountNumber, balance, interestRate);
        this.overDraftLimit = overDraftLimit;


    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "overDraftLimit=" + overDraftLimit +
                '}';
    }
}
