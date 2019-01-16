package DecoratorPattern;

public class BankName implements IBank {

    private String bankName;

    public BankName() {
        bankName = "Moldincombank: ";
    }

    @Override
    public String BankInformation() {
        return bankName;
    }
}
