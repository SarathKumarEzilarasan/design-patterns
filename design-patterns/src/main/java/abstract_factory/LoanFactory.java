package abstract_factory;

import abstract_factory.bank.Bank;
import abstract_factory.loan.CarLoan;
import abstract_factory.loan.HomeLoan;
import abstract_factory.loan.Loan;

public class LoanFactory extends AbstractFactory {
    @Override
    public Bank getBank(String name) {
        return null;
    }

    public Loan getLoan(String loan) {
        if (loan.equalsIgnoreCase("home")) {
            return new HomeLoan();
        } else {
            return new CarLoan();
        }
    }
}
