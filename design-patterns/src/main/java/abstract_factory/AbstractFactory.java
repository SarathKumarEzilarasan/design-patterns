package abstract_factory;

import abstract_factory.bank.Bank;
import abstract_factory.loan.Loan;

public abstract class AbstractFactory {
    abstract Bank getBank(String name);

    abstract Loan getLoan(String name);
}
