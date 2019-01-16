package DecoratorPattern;

public class Deposits extends BankDecorator{

    private String SPACE = ", ";
    private String depositsInformation = "Depositing Section";

    public Deposits(IBank _bank) {
        super(_bank);
    }

    public String BankInformation() {
        return _bank.BankInformation() + deposits();
    }

    private String deposits() {
        return depositsInformation + SPACE;
    }
}
