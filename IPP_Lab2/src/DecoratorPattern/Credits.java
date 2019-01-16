package DecoratorPattern;

public class Credits extends BankDecorator {

    private String creditInformation =  "Crediting Section";

    public Credits(IBank _bank) {
        super(_bank);
    }

    public String BankInformation() {
        return _bank.BankInformation() + credits();
    }

    private String credits() {
        return creditInformation;
    }
}
