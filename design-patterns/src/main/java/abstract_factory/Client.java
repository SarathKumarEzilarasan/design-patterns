package abstract_factory;

import abstract_factory.bank.Bank;
import abstract_factory.loan.Loan;

public class Client {
    public static void main(String[] args) {
        AbstractFactory bankFactory = new BankFactory();
        Bank bank = bankFactory.getBank("sbi");
        AbstractFactory loanFactory = new LoanFactory();
        Loan loan = loanFactory.getLoan("home");
        System.out.println(bank.getBankName());
        System.out.println(loan.getInterestRate());
    }
}
