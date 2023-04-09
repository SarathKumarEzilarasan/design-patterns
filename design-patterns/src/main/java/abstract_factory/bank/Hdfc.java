package abstract_factory.bank;

public class Hdfc implements Bank {
    @Override
    public String getBankName() {
        return "HDFC";
    }
}
