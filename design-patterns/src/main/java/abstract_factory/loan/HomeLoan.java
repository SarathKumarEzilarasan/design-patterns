package abstract_factory.loan;

public class HomeLoan implements Loan{
    @Override
    public int getInterestRate() {
        return 10;
    }
}
