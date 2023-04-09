package abstract_factory;

import abstract_factory.bank.Bank;
import abstract_factory.bank.Hdfc;
import abstract_factory.bank.Sbi;
import abstract_factory.loan.Loan;

public class BankFactory extends AbstractFactory {
    public Bank getBank(String bank) {
        if (bank.equalsIgnoreCase("sbi")) {
            return new Sbi();
        } else {
            return new Hdfc();
        }
    }

   public Loan getLoan(String loan) {
        return null;
    }
}
