package chapter11codes.elfpunktedrei;

public class SavingsAccount extends Account{
    private  double overDraftLimit = 0;

    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance, interestRate);
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "overDraftLimit=" + overDraftLimit +
                '}';
    }
}
