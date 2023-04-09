package abstract_factory.bank;

public class Sbi implements Bank {

    @Override
    public String getBankName() {
        return "SBI";
    }
}
