package abstract_factory.loan;

public class CarLoan implements Loan {
    @Override
    public int getInterestRate() {
        return 15;
    }
}
