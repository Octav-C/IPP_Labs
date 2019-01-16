package DecoratorPattern;

public abstract class BankDecorator implements IBank {

    protected  IBank _bank;

    public BankDecorator(IBank _bank) {
        this._bank = _bank;
    }

    public String BankInformation() {
        return _bank.BankInformation();
    }
}
